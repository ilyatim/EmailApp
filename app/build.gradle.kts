typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.unfixedbo1t.dependency")
    id("com.unfixedbo1t.android.compose")
    id("com.unfixedbo1t.android.application")
}

android {
    namespace = "com.unfixedbo1t.mailapp"

    defaultConfig {
        applicationId = "com.unfixedbo1t.mailapp"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    dep.core.apply {
        implementation(androidCoreKtx)
    }
    dep.lifecycle.apply {
        implementation(lifecycleRunKtx)
    }
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}
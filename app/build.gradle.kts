typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.unfixedbo1t.android.application.compose")
    id("com.unfixedbo1t.android.application")
    id("com.unfixedbo1t.android.hilt")
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
    implementation(project(":uikit"))
    implementation(project(":feature:messagesending"))
    /*
    dep.core.apply {
        implementation(androidCoreKtx)
    }*/
    dep.lifecycle.apply {
        implementation(lifecycleRunKtx)
    }
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}

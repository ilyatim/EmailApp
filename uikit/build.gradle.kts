typealias dep = com.unfixedbo1t.dependency.Dependency
typealias and = com.unfixedbo1t.dependency.Android

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dependency")
}

android {
    namespace = "com.unfixedbo1t.uikit"
    compileSdk = and.compileVersion

    defaultConfig {
        applicationId = "com.unfixedbo1t.uikit"
        minSdk = and.minVersion
        targetSdk = and.targetVersion
        versionCode = and.versionCode
        versionName = and.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}
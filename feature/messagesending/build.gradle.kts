typealias and = com.unfixedbo1t.dependency.Android
typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dependency")
}

android {
    namespace = "com.unfixedbo1t.messagesending"
    compileSdk = and.compileVersion

    defaultConfig {
        applicationId = "com.unfixedbo1t.messagesending"
        minSdk = and.minVersion
        targetSdk = and.targetVersion
        versionCode = and.versionCode
        versionName = and.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        /*vectorDrawables {
            useSupportLibrary = true
        }*/
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = and.kotlinCompileExtVersion
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
    dep.ui.apply {
        implementation(composeUi)
        implementation(composeUiToolingPreview)
        implementation(composeMaterial)
        debugImplementation(composeUiTooling)
        debugImplementation(composeUiTestManifest)
        androidTestImplementation(composeUiTestJunit)
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
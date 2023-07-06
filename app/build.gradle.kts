import com.android.build.gradle.internal.tasks.factory.dependsOn

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

tasks.preBuild.dependsOn("ktlintCheck")
tasks.check.dependsOn("ktlintCheck")

dependencies {
    implementation(project(":uikit"))
    implementation(project(":feature:messagesending"))

    implementation(libs.lifecycle.run.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.androidExt)
    androidTestImplementation(libs.espresso.core)
}

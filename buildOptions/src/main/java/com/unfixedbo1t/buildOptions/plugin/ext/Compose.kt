@file:Suppress("UnstableApiUsage")

package com.unfixedbo1t.buildOptions.plugin.ext

import com.android.build.api.dsl.CommonExtension
import com.unfixedbo1t.buildOptions.Android
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType


internal fun Project.configureComposeAndroid(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        composeOptions {
            kotlinCompilerExtensionVersion = Android.kotlinCompileExtVersion
        }
        buildFeatures {
            compose = true
        }

        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        dependencies {
            //TODO: use bom
            //add("implementation", platform(dep.ui.composeBom))
            //add("androidTestImplementation", platform(dep.ui.composeBom))
            implementation(libs.findLibrary("compose.ui").get())
            implementation(libs.findLibrary("compose.ui.toolingPreview").get())
            implementation(libs.findLibrary("compose.material").get())
            implementation(libs.findLibrary("compose.material").get())
            implementation(libs.findLibrary("compose.coil").get())
            implementation(libs.findLibrary("compose.foundation").get())
            implementation(libs.findLibrary("systemUiController").get())
            implementation(libs.findLibrary("compose.lifecycle.runtimeExt").get())
            implementation(libs.findLibrary("compose.navigation").get())
            implementation(libs.findLibrary("compose.navigation.runtimeKtx").get())
            debugImplementation(libs.findLibrary("compose.ui.tooling").get())
            debugImplementation(libs.findLibrary("compose.ui.test.manifest").get())
            androidTestImplementation(libs.findLibrary("compose.ui.test.junit").get())
        }
    }
}

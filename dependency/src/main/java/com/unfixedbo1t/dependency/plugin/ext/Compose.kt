@file:Suppress("UnstableApiUsage")

package com.unfixedbo1t.dependency.plugin.ext

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

typealias and = com.unfixedbo1t.dependency.Android
typealias dep = com.unfixedbo1t.dependency.Dependency

internal fun Project.configureComposeAndroid(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        composeOptions {
            kotlinCompilerExtensionVersion = and.kotlinCompileExtVersion
        }
        buildFeatures {
            compose = true
        }
        dependencies {
            //TODO: use bom
            //add("implementation", platform(dep.ui.composeBom))
            //add("androidTestImplementation", platform(dep.ui.composeBom))
            implementation(dep.ui.composeUi)
            implementation(dep.ui.composeUiToolingPreview)
            implementation(dep.ui.composeMaterial)
            implementation(dep.lifecycle.composeLifecycleRuntimeExt)
            implementation(dep.navigation.composeNavigation)
            implementation(dep.navigation.composeRuntimeKtxNavigation)
            debugImplementation(dep.ui.composeUiTooling)
            debugImplementation(dep.ui.composeUiTestManifest)
            androidTestImplementation(dep.ui.composeUiTestJunit)
        }
    }
}

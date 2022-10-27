package com.unfixedbo1t.dependency.plugin.ext

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureFeatureDependencies(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        dependencies {
            implementation(project(":uikit"))
            implementation(project(":core:utils"))

            implementation(dep.navigation.hiltComposeNavigation)
            implementation(dep.lifecycle.composeLifecycleRuntimeExt)
            implementation(dep.lifecycle.viewModel)
            implementation(dep.lifecycle.lifecycleRunKtx)
        }
    }
}
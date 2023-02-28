package com.unfixedbo1t.buildOptions.plugin.ext

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureFeatureDependencies(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        dependencies {
            implementation(project(":uikit"))
            implementation(project(":core:utils"))
            implementation(project(":core:model"))
            implementation(project(":core:network"))
            implementation(project(":core:resources"))

            implementation(libs.findLibrary("hilt.compose.navigation").get())
            implementation(libs.findLibrary("compose.lifecycle.runtimeExt").get())
            implementation(libs.findLibrary("viewModel.ktx").get())
            implementation(libs.findLibrary("lifecycle.run.ktx").get())
        }
    }
}
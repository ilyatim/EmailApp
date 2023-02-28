@file:Suppress("unused")

package com.unfixedbo1t.buildOptions.plugin

import com.unfixedbo1t.buildOptions.plugin.ext.implementation
import com.unfixedbo1t.buildOptions.plugin.ext.kapt
import com.unfixedbo1t.buildOptions.plugin.ext.kaptAndroidTest
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.kapt")
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            dependencies {

                implementation(libs.findLibrary("hilt.android").get())
                kapt(libs.findLibrary("hilt.android.compiler").get())
                kaptAndroidTest(libs.findLibrary("hilt.android.compiler").get())
            }
        }
    }
}
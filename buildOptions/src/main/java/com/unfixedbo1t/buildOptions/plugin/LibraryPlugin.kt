@file:Suppress("unused")

package com.unfixedbo1t.buildOptions.plugin

import com.android.build.api.dsl.LibraryExtension
import com.unfixedbo1t.buildOptions.Android
import com.unfixedbo1t.buildOptions.plugin.ext.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class LibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                defaultConfig.targetSdk = Android.targetVersion
                configureKotlinAndroid(this)
            }
        }
    }
}
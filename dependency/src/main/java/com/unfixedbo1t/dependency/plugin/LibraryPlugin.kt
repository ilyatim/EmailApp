@file:Suppress("unused")

package com.unfixedbo1t.dependency.plugin

import com.android.build.api.dsl.LibraryExtension
import com.unfixedbo1t.dependency.plugin.ext.and
import com.unfixedbo1t.dependency.plugin.ext.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.get

class LibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                defaultConfig.targetSdk = and.targetVersion
                configureKotlinAndroid(this)
            }
        }
    }
}
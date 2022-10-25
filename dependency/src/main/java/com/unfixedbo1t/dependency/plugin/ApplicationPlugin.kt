package com.unfixedbo1t.dependency.plugin

import com.android.build.api.dsl.ApplicationExtension
import com.unfixedbo1t.dependency.plugin.ext.and
import com.unfixedbo1t.dependency.plugin.ext.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                defaultConfig.targetSdk = and.targetVersion
                configureKotlinAndroid(this)
            }
        }
    }
}
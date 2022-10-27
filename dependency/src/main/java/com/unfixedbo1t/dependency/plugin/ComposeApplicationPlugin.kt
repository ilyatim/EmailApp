package com.unfixedbo1t.dependency.plugin

import com.android.build.api.dsl.ApplicationExtension
import com.unfixedbo1t.dependency.plugin.ext.configureComposeAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class ComposeApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            configureComposeAndroid(extensions.getByType<ApplicationExtension>())
        }
    }
}
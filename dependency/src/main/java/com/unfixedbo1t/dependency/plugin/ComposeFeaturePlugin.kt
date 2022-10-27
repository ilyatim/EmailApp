@file:Suppress("unused")

package com.unfixedbo1t.dependency.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ComposeFeaturePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.unfixedbo1t.android.library.compose")
                apply("com.unfixedbo1t.android.feature")
            }
        }
    }
}
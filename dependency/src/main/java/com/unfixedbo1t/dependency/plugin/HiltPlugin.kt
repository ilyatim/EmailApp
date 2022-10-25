package com.unfixedbo1t.dependency.plugin

import com.unfixedbo1t.dependency.plugin.ext.dep
import com.unfixedbo1t.dependency.plugin.ext.implementation
import com.unfixedbo1t.dependency.plugin.ext.kapt
import com.unfixedbo1t.dependency.plugin.ext.kaptAndroidTest
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.kapt")
                //TODO: handle version problem
                apply("dagger.hilt.android.plugin")
            }

            dependencies {
                implementation(dep.di.hiltAndroid)
                kapt(dep.di.hiltAndroidCompiler)
                kaptAndroidTest(dep.di.hiltAndroidCompiler)
            }
        }
    }
}
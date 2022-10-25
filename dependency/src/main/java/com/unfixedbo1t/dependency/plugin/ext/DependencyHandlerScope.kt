package com.unfixedbo1t.dependency.plugin.ext

import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementation(notation: String): Dependency? =
    add("implementation", notation)

internal fun DependencyHandlerScope.androidTestImplementation(notation: String): Dependency? =
    add("androidTestImplementation", notation)

internal fun DependencyHandlerScope.debugImplementation(notation: String): Dependency? =
    add("debugImplementation", notation)

internal fun DependencyHandlerScope.kapt(notation: String): Dependency? =
    add("kapt", notation)

internal fun DependencyHandlerScope.kaptAndroidTest(notation: String): Dependency? =
    add("kaptAndroidTest", notation)
//Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "7.3.0-rc01" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.20" apply false
    id("com.google.dagger.hilt.android") version "2.42" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0" apply false
    id("com.android.library") version "7.3.0-rc01" apply false
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

tasks.register<Copy>("installGitHook") {
    from(file("${rootProject.rootDir}/scripts/pre-commit"))
    into(file("${rootProject.rootDir}/git/hooks"))
}
tasks.getByPath(":app:preBuild").dependsOn("installGitHook")
/*
task installGitHook(type: Copy) {
    from new File(rootProject.rootDir, './scripts/pre-commit')
    into { new File(rootProject.rootDir, '.git/hooks') }
    fileMode 0777
}
tasks.getByPath(':app:preBuild').dependsOn installGitHook*/


pluginManagement {
    /*plugins {
        id("org.jetbrains.kotlin.android") version "1.6.10"
    }*/
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Mail"
include(":app")
include(":feature:messagesending")
include(":core:utils")
include(":uikit")
includeBuild("dependency")

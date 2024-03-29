pluginManagement {
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
includeBuild("buildOptions")
include(":app")
include(":feature:messagesending")
include(":core:utils")
include(":uikit")
include(":core:model")
include(":core:network")
include(":core:resources")

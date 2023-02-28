plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.example.dependency"

dependencies {
    compileOnly("com.android.tools.build:gradle:7.3.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
}

gradlePlugin {
    plugins.register("androidComposeApplication") {
        id = "com.unfixedbo1t.android.application.compose"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.ComposeApplicationPlugin"
    }
    plugins.register("androidApplication") {
        id = "com.unfixedbo1t.android.application"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.ApplicationPlugin"
    }
    plugins.register("androidLibrary") {
        id = "com.unfixedbo1t.android.library"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.LibraryPlugin"
    }
    plugins.register("androidHilt") {
        id = "com.unfixedbo1t.android.hilt"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.HiltPlugin"
    }
    plugins.register("androidCompose") {
        id = "com.unfixedbo1t.android.library.compose"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.ComposeLibraryPlugin"
    }
    plugins.register("androidFeature") {
        id = "com.unfixedbo1t.android.feature"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.FeaturePlugin"
    }
    plugins.register("androidComposeFeature") {
        id = "com.unfixedbo1t.android.feature.compose"
        implementationClass = "com.unfixedbo1t.buildOptions.plugin.ComposeFeaturePlugin"
    }
}

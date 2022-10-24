plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.example.dependency"
version = "0.0.1"

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins.register("dependency") {
        id = "dependency"
        implementationClass = "com.unfixedbo1t.dependency.plugin.ProjectPlugin"
    }
}

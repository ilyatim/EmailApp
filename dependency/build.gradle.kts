plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.example.dependency"
version = "0.0.1"

gradlePlugin {
    plugins.register("dependency") {
        id = "dependency"
        implementationClass = "com.example.dependencies.ProjectPlugin"
    }
}

typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.unfixedbo1t.android.feature.compose")
}

android {
    namespace = "com.unfixedbo1t.messagesending"
}

dependencies {
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}

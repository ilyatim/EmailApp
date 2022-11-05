typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.unfixedbo1t.android.library")
    id("com.unfixedbo1t.android.hilt")
}

android {
    namespace = "com.unfixedbo1t.utils"
}

dependencies {
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}

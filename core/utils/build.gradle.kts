typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    //id("dagger.hilt.android.plugin")
    id("com.unfixedbo1t.dependency")
    id("com.unfixedbo1t.android.library")
    //id("com.unfixedbo1t.android.hilt")
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
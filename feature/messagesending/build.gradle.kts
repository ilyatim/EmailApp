typealias dep = com.unfixedbo1t.dependency.Dependency

plugins {
    id("com.unfixedbo1t.dependency")
    //id("com.unfixedbo1t.android.compose")
    id("com.unfixedbo1t.android.library")
    //id("com.unfixedbo1t.android.hilt")
}

android {
    namespace = "com.unfixedbo1t.messagesending"
}

dependencies {
    dep.navigation.apply {
        implementation(composeRuntimeKtxNavigation)
    }
    dep.core.apply {
        implementation(androidCoreKtx)
    }
    dep.lifecycle.apply {
        implementation(lifecycleRunKtx)
    }
    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(junitAndroidExt)
        androidTestImplementation(espressoCore)
    }
}
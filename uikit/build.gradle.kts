plugins {
    id("com.unfixedbo1t.android.library")
    id("com.unfixedbo1t.android.library.compose")
}

android {
    namespace = "com.unfixedbo1t.uikit"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.androidExt)
    androidTestImplementation(libs.espresso.core)
}

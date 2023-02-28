plugins {
    id("com.unfixedbo1t.android.library")
    id("com.unfixedbo1t.android.hilt")
}

android {
    namespace = "com.unfixedbo1t.utils"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.androidExt)
    androidTestImplementation(libs.espresso.core)
}

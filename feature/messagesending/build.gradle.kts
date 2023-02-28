plugins {
    id("com.unfixedbo1t.android.feature.compose")
}

android {
    namespace = "com.unfixedbo1t.messagesending"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.androidExt)
    androidTestImplementation(libs.espresso.core)
}

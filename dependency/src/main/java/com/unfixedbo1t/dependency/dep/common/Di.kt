package com.unfixedbo1t.dependency.dep.common

object Di {
    /**
     * A fast dependency injector for Android and Java.
     * @see [https://mvnrepository.com/artifact/com.google.dagger/hilt-android-compiler]
     */
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"

    /**
     * A fast dependency injector for Android and Java.
     * @see [https://mvnrepository.com/artifact/com.google.dagger/hilt-android]
     */
    const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
}

private const val hiltVersion = "2.44"
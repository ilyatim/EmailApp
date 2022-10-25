@file:Suppress("unused")

package com.unfixedbo1t.dependency.dep.common

object Core {
    /**
     * Kotlin extensions for 'core' artifact
     * @see [https://mvnrepository.com/artifact/androidx.core/core-ktx]
     */
    const val androidCoreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    /**
     * The Support Library is a static library that you can add to your Android application in order
     * to use APIs that are either not available for older platform versions or utility APIs
     * that aren't a part of the framework APIs. Compatible on devices running API 14 or later.
     * @see [https://mvnrepository.com/artifact/androidx.appcompat/appcompat]
     */
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
}

private const val coreKtxVersion = "1.8.0"
private const val appCompatVersion = "1.4.2"
package com.unfixedbo1t.dependency.dep.common

import com.unfixedbo1t.dependency.dep.CommonVersions.lifecycleVersion
import com.unfixedbo1t.dependency.dep.CommonVersions.viewModelVersion

object Lifecycle {
    /**
     * Kotlin extensions for 'viewmodel' artifact
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx]
     */
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion"

    /**
     * Kotlin extensions for 'lifecycle' artifact
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx]
     */
    const val lifecycleRunKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"

    /**
     * Compose integration with Lifecycle
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-compose]
     */
    const val composeLifecycleRuntimeExt: String = "androidx.lifecycle:lifecycle-runtime-compose:$composeLifecycleVersion"
}

private const val composeLifecycleVersion = "2.6.0-alpha03"
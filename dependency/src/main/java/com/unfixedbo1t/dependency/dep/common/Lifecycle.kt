package com.unfixedbo1t.dependency.dep.common

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
}

//ViewModel
const val viewModelVersion = "2.4.0"
//Lifecycle
const val lifecycleVersion = "2.3.1"
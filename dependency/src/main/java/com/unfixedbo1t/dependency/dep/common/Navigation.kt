package com.unfixedbo1t.dependency.dep.common

object Navigation {
    /**
     * Compose integration with Navigation
     * @see [https://mvnrepository.com/artifact/androidx.navigation/navigation-compose]
     */
    const val composeNavigation: String = "androidx.navigation:navigation-compose:$composeNavVersion"

    /**
     * Android Navigation-Runtime-Ktx
     * @see [https://mvnrepository.com/artifact/androidx.navigation/navigation-runtime-ktx]
     */
    const val composeRuntimeKtxNavigation: String = "androidx.navigation:navigation-runtime-ktx:$composeNavVersion"
}

private const val composeNavVersion = "2.5.2"

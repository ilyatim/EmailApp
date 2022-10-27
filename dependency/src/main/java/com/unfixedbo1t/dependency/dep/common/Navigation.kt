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

    /**
     * Navigation Compose Hilt Integration
     * @see [https://mvnrepository.com/artifact/androidx.hilt/hilt-navigation-compose]
     */
    const val hiltComposeNavigation: String = "androidx.hilt:hilt-navigation-compose:$composeHiltNavigationVersion"
}

private const val composeNavVersion = "2.5.2"
private const val composeHiltNavigationVersion = "1.0.0"

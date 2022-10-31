@file:Suppress("unused")

package com.unfixedbo1t.dependency.dep.common

import com.unfixedbo1t.dependency.dep.CommonVersions

object Ui {
    /**
     * A compatible set of Jetpack Compose libraries.
     * @see [https://mvnrepository.com/artifact/androidx.compose/compose-bom/2022.10.00]
     */
    const val composeBom: String = "androidx.compose:compose-bom:$composeBomVersion"
    /**
     * Compose integration with Activity
     * @see [https://mvnrepository.com/artifact/androidx.activity/activity-compose]
     */
    const val activityCompose: String = "androidx.activity:activity-compose:$composeActivityVersion"

    /**
     * Compose UI primitives. This library contains the primitives that form the Compose UI Toolkit,
     * such as drawing, measurement and layout.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui]
     */
    const val composeUi: String = "androidx.compose.ui:ui:$composeUiVersion"

    /**
     * Compose tooling library API.
     * This library provides the API required to declare @Preview composables in user apps.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-tooling-preview]
     */
    const val composeUiToolingPreview: String = "androidx.compose.ui:ui-tooling-preview:$composeUiToolingPreviewVersion"

    /**
     * Compose Material Design Components library
     * @see [https://mvnrepository.com/artifact/androidx.compose.material/material]
     */
    const val composeMaterial: String = "androidx.compose.material:material:$composeMaterialVersion"

    /**
     * Compose tooling library. This library exposes information to our tools for better IDE support.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-tooling]
     */
    const val composeUiTooling: String = "androidx.compose.ui:ui-tooling:$composeUiToolingVersion"

    /**
     * Compose testing library that should be added as a debugImplementation dependency to add properties
     * to the debug manifest necessary for testing an application
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-test-manifest]
     */
    const val composeUiTestManifest: String = "androidx.compose.ui:ui-test-manifest:$composeUiTestManifestVersion"

    /**
     * Compose testing integration with JUnit4
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-test-junit4]
     */
    const val composeUiTestJunit: String = "androidx.compose.ui:ui-test-junit4:$composeUiTestJunitVersion"

    /**
     * Utilities for Jetpack Compose
     * @see [https://mvnrepository.com/artifact/com.google.accompanist/accompanist-systemuicontroller]
     */
    const val systemUiController: String = "com.google.accompanist:accompanist-systemuicontroller:$systemUiControllerVersion"

}

private const val systemUiControllerVersion = "0.27.0"
private const val composeActivityVersion = "1.6.0"
private const val composeBomVersion = "2022.10.00"
private const val composeUiVersion = CommonVersions.composeVersion
private const val composeUiToolingPreviewVersion = CommonVersions.composeVersion
private const val composeMaterialVersion = CommonVersions.composeVersion
private const val composeUiToolingVersion: String = CommonVersions.composeVersion
private const val composeUiTestManifestVersion: String = CommonVersions.composeVersion
private const val composeUiTestJunitVersion: String = CommonVersions.composeVersion
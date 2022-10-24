@file:Suppress("unused")

package com.unfixedbo1t.dependency.dep

object Test {
    /**
     * JUnit is a unit testing framework to write and run repeatable automated tests on Java.
     * @see [https://mvnrepository.com/artifact/junit/junit]
     */
    const val junit: String = "junit:junit:$junitVersion"

    /**
     *
     * @see [https://mvnrepository.com/artifact/androidx.test.ext/junit]
     */
    const val junitAndroidExt: String = "androidx.test.ext:junit:$junitAndroidExtVersion"

    /**
     * @see [The AndroidX Test Library provides an extensive framework for testing Android apps]
     */
    const val espressoCore: String = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
}

const val junitVersion = "4.13.2"
const val junitAndroidExtVersion = "1.1.3-rc01"
const val espressoCoreVersion = "3.4.0"

package com.unfixedbo1t.dependency

import com.unfixedbo1t.dependency.dep.Core
import com.unfixedbo1t.dependency.dep.Di
import com.unfixedbo1t.dependency.dep.Lifecycle
import com.unfixedbo1t.dependency.dep.Other
import com.unfixedbo1t.dependency.dep.RxJava
import com.unfixedbo1t.dependency.dep.Test
import com.unfixedbo1t.dependency.dep.Ui

object Dependency {
    val android = Android
    val di = Di
    val ui = Ui
    val lifecycle = Lifecycle
    val test = Test
    val rxJava = RxJava
    val core = Core
    val other = Other
}
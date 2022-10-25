package com.unfixedbo1t.dependency

import com.unfixedbo1t.dependency.dep.common.Core
import com.unfixedbo1t.dependency.dep.common.Di
import com.unfixedbo1t.dependency.dep.common.Lifecycle
import com.unfixedbo1t.dependency.dep.common.Navigation
import com.unfixedbo1t.dependency.dep.common.Other
import com.unfixedbo1t.dependency.dep.common.RxJava
import com.unfixedbo1t.dependency.dep.common.Test
import com.unfixedbo1t.dependency.dep.common.Ui

object Dependency {
    val android = Android
    val di = Di
    val ui = Ui
    val lifecycle = Lifecycle
    val test = Test
    val rxJava = RxJava
    val core = Core
    val navigation = Navigation
    val other = Other
}
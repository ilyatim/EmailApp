package com.unfixedbo1t.mailapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.unfixedbo1t.mailapp.navigation.AppNavHost

@Composable
fun EmailApp(
    state: AppState = rememberAppState()
) {
    AppNavHost(
        navController = state.navController,
        onBackClick = state::onBackClick,

        modifier = Modifier
            /*.padding(padding)
            .consumedWindowInsets(padding)*/
    )
}
package com.unfixedbo1t.mailapp

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.unfixedbo1t.mailapp.navigation.AppNavHost

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EmailApp(
    state: AppState = rememberAppState()
) {
    Scaffold(
        modifier = Modifier.statusBarsPadding()
    ) { paddingValue ->
        AppNavHost(
            navController = state.navController,
            onBackClick = state::onBackClick,

            modifier = Modifier
                .padding(paddingValue)
                .consumedWindowInsets(paddingValue)
        )
    }
}
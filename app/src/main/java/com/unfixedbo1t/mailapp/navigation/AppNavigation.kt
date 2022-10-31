package com.unfixedbo1t.mailapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.unfixedbo1t.messagesending.navigation.SEND_MESSAGE_ROUTE
import com.unfixedbo1t.messagesending.navigation.messageSendingScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    startDestination: String = SEND_MESSAGE_ROUTE,
    navController: NavHostController,
    onBackClick: () -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        messageSendingScreen(onBackClick)
    }
}
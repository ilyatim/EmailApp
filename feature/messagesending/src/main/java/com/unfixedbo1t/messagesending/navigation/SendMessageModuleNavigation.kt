package com.unfixedbo1t.messagesending.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unfixedbo1t.messagesending.ui.SendMessageScreen

private const val ROUTE: String = "message_sending_route"

fun NavController.navigateToMessageSending(

) {
    this.navigate("$ROUTE/")
}

fun NavGraphBuilder.messageSendingScreen(
    onBackClick: () -> Unit
) {
    composable(
        route = "$ROUTE/",
        arguments = listOf()
    ) {
        SendMessageScreen(
            onBackClick = onBackClick
        )
    }
}
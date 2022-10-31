package com.unfixedbo1t.messagesending.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unfixedbo1t.messagesending.ui.SendMessageScreen

const val SEND_MESSAGE_ROUTE: String = "message_sending_route"

fun NavController.navigateToMessageSending(

) {
    this.navigate("$SEND_MESSAGE_ROUTE")
}

fun NavGraphBuilder.messageSendingScreen(
    onBackClick: () -> Unit
) {
    composable(
        route = "$SEND_MESSAGE_ROUTE",
        arguments = listOf()
    ) {
        SendMessageScreen(
            onBackClick = onBackClick
        )
    }
}
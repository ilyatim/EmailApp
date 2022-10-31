package com.unfixedbo1t.messagesending.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unfixedbo1t.messagesending.SendMessageViewModel
import com.unfixedbo1t.messagesending.ui.content.ContentSendMessageScreen

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun SendMessageScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SendMessageViewModel = hiltViewModel()
) {
    LaunchedEffect(viewModel) {
        viewModel.effects.collect(::handleSideEffect)
    }
    val state: UiState by viewModel.uiState.collectAsStateWithLifecycle()
    SendMessageScreen(
        onBackClick = onBackClick,
        state = state,
    )
}

@Composable
private fun SendMessageScreen(
    state: UiState,
    onBackClick: () -> Unit,
    onCancelClick: () -> Unit,
    onSendClick: () -> Unit
) {
    when {
        state.isError -> ErrorSendMessageScreen()
        state.isLoading -> LoadingSendMessageScreen()
        else -> ContentSendMessageScreen(
            onCancelClick = {},
            onSendClick = {},
        )
    }
}

private fun handleSideEffect(effect: Effect) {
    when (effect) {
        is Effect.Toast -> TODO()
    }
}

sealed interface Effect {
    data class Toast(val value: String): Effect
}

data class UiState(
    val string: String = "",
    val isLoading: Boolean = false,
    val isError: Boolean = false
)
package com.unfixedbo1t.messagesending.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unfixedbo1t.messagesending.Effect
import com.unfixedbo1t.messagesending.UiState
import com.unfixedbo1t.messagesending.SendMessageViewModel
import kotlinx.coroutines.flow.collect

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
    onBackClick: () -> Unit,
    state: UiState
) {
    when {
        state.isError -> ErrorSendMessageScreen()
        state.isLoading -> LoadingSendMessageScreen()
        else -> ContentSendMessageScreen()
    }
}

private fun handleSideEffect(effect: Effect) {
    when (effect) {
        is Effect.Toast -> TODO()
    }
}

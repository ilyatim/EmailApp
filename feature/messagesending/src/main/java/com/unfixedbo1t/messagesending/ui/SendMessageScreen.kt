package com.unfixedbo1t.messagesending.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unfixedbo1t.messagesending.UiState
import com.unfixedbo1t.messagesending.SendMessageViewModel

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun SendMessageScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SendMessageViewModel = hiltViewModel()
) {
    LaunchedEffect(viewModel) {

    }
    val state = viewModel.uiState.collectAsStateWithLifecycle()
}

@Composable
private fun SendMessageScreen(
    state: UiState
) {
    when {
        state.isError -> ErrorSendMessageScreen()
        state.isLoading -> LoadingSendMessageScreen()
        else -> ContentSendMessageScreen()
    }
}
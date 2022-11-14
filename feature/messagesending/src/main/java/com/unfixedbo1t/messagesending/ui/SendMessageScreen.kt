package com.unfixedbo1t.messagesending.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unfixedbo1t.messagesending.Recipient
import com.unfixedbo1t.messagesending.SendMessageViewModel
import com.unfixedbo1t.messagesending.ui.content.ContentSendMessageScreen

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun SendMessageScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SendMessageViewModel = hiltViewModel()
) {
    val localContext = LocalContext.current

    LaunchedEffect(viewModel) {
        viewModel.effects.collect { value ->
            handleSideEffect(value, localContext)
        }
    }
    val state: UiState by viewModel.uiState.collectAsStateWithLifecycle()
    SendMessageScreen(
        state = state,
        onBackClick = onBackClick,
        onCancelClick = { viewModel.onCancelClick() },
        onSendClick = { viewModel.onSendClick() }
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
            onCancelClick = onCancelClick,
            onSendClick = onSendClick,
            recipients = state.recipients
        )
    }
}

private fun handleSideEffect(effect: Effect, context: Context) {
    when (effect) {
        is Effect.Toast -> Toast.makeText(context, effect.value, Toast.LENGTH_SHORT).show()
    }
}

sealed interface Effect {
    data class Toast(val value: String) : Effect
}

data class UiState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val recipients: List<Recipient> = listOf()
)

package com.unfixedbo1t.messagesending.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.unfixedbo1t.messagesending.SendMessageViewModel

@Composable
internal fun SendMessageScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SendMessageViewModel = hiltViewModel()
) {

}
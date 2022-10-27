package com.unfixedbo1t.messagesending

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class SendMessageViewModel @Inject constructor(

) : ViewModel() {
    val uiState: StateFlow<SendMessageUiState> = MutableStateFlow(SendMessageUiState("some"))
}

data class SendMessageUiState(
    val string: String
)
package com.unfixedbo1t.messagesending

import com.unfixedbo1t.model.BaseMviViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SendMessageViewModel @Inject constructor() : BaseMviViewModel<UiState, Effect>(
    UiState()
) {

}

sealed class Effect {
    data class Toast(val value: String): Effect()
}

data class UiState(
    val string: String = "",
    val isLoading: Boolean = false,
    val isError: Boolean = false
)
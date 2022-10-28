package com.unfixedbo1t.messagesending

import com.unfixedbo1t.model.BaseMviViewModel
import com.unfixedbo1t.model.dispatchers.Dispatcher
import com.unfixedbo1t.model.dispatchers.MDispatchers
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher

@HiltViewModel
class SendMessageViewModel @Inject constructor(
    @Dispatcher(MDispatchers.MAIN) dispatcher: CoroutineDispatcher
) : BaseMviViewModel<UiState, Effect>(
    UiState(),
    dispatcher
) {

}

sealed interface Effect {
    data class Toast(val value: String): Effect
}

data class UiState(
    val string: String = "",
    val isLoading: Boolean = false,
    val isError: Boolean = false
)
package com.unfixedbo1t.messagesending

import com.unfixedbo1t.messagesending.ui.Effect
import com.unfixedbo1t.messagesending.ui.UiState
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
    fun onCancelClick() {
        sendEffect(Effect.Toast("cancel"))
    }

    fun onSendClick() {
        sendEffect(Effect.Toast("send"))
    }
}
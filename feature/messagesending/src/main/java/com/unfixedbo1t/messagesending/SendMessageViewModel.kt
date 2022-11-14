package com.unfixedbo1t.messagesending

import com.unfixedbo1t.messagesending.ui.Effect
import com.unfixedbo1t.messagesending.ui.UiState
import com.unfixedbo1t.model.BaseMviViewModel
import com.unfixedbo1t.model.dispatchers.Dispatcher
import com.unfixedbo1t.model.dispatchers.MDispatchers
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class SendMessageViewModel @Inject constructor(
    private val repository: RecipientRepository,
    @Dispatcher(MDispatchers.MAIN) dispatcher: CoroutineDispatcher
) : BaseMviViewModel<UiState, Effect>(
    UiState(),
    dispatcher
) {
    init {
        launch {
            setUiState(
                UiState(recipients = repository.getAvailable())
            )
        }
    }
    fun onCancelClick() {
        sendEffect(Effect.Toast("cancel"))
    }

    fun onSendClick() {
        sendEffect(Effect.Toast("send"))
    }
}

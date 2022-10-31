package com.unfixedbo1t.model

import androidx.lifecycle.ViewModel
import com.unfixedbo1t.model.dispatchers.Dispatcher
import com.unfixedbo1t.model.dispatchers.MDispatchers
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainCoroutineDispatcher
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class BaseMviViewModel<STATE: Any, EFFECT: Any>(
    initialState: STATE,
    dispatcherMain: CoroutineDispatcher = Dispatchers.Main,
) : ViewModel(), CoroutineScope by CoroutineScope(SupervisorJob() + dispatcherMain) {
    private val _uiState: MutableStateFlow<STATE> = MutableStateFlow(initialState)
    private val _effectsFlow: MutableSharedFlow<EFFECT> = MutableSharedFlow()
    val uiState: StateFlow<STATE>

        get() = _uiState.asStateFlow()
    val effects: SharedFlow<EFFECT>
        get() = _effectsFlow.asSharedFlow()

    protected fun setUiState(state: STATE) {
        _uiState.value = state
    }

    protected fun sendEffect(effect: EFFECT) {
        launch {
            _effectsFlow.emit(effect)
        }
    }
}
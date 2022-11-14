package com.unfixedbo1t.network

sealed class Result<out T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error(val error: Exception) : Result<Nothing>()
}

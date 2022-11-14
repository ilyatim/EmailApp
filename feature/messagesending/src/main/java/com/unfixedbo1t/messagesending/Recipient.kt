package com.unfixedbo1t.messagesending

data class Recipient(
    val id: Int,
    val email: String,
    val image: String? = null,
)

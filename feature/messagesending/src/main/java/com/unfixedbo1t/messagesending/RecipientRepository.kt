package com.unfixedbo1t.messagesending

import javax.inject.Inject

interface RecipientRepository {
    @Deprecated("remove soon")
    suspend fun getAvailable(): List<Recipient>
}

class RecipientRepositoryImpl @Inject constructor() : RecipientRepository {
    override suspend fun getAvailable(): List<Recipient> {
        return listOf(
            Recipient(1, "some@email.ru"),
            Recipient(1, "sometest@email.ru"),
            Recipient(1, "sometest2@email.ru"),
            Recipient(1, "somelooooooooong@email.ru"),
        )
    }
}

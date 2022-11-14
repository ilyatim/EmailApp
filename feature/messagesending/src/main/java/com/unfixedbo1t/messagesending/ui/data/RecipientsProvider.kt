package com.unfixedbo1t.messagesending.ui.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.unfixedbo1t.messagesending.Recipient

class RecipientsProvider : PreviewParameterProvider<List<Recipient>> {
    override val values: Sequence<List<Recipient>> = sequenceOf(
        listOf(
            Recipient(1, "some@mail.ru"),
            Recipient(22, "test@email.ru"),
            Recipient(33, "some15@gmail.com"),
            Recipient(100, "somelooooooooooongtestemail@mail.ru")
        )
    )
    override val count: Int
        get() = values.count()
}

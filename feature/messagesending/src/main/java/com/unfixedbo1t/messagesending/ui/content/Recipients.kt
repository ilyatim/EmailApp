package com.unfixedbo1t.messagesending.ui.content

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.DrawableCompat
import com.unfixedbo1t.messagesending.Recipient
import com.unfixedbo1t.messagesending.ui.data.RecipientsProvider
import com.unfixedbo1t.resources.R
import com.unfixedbo1t.uikit.component.CoilImage
import com.unfixedbo1t.uikit.component.SubtitleText
import com.unfixedbo1t.uikit.theme.MailAppTheme
import com.unfixedbo1t.uikit.theme.getColorSystem

@Composable
internal fun SendTo(
    recipients: List<Recipient>,
    onInputChanged: (String) -> Unit,
    onClick: (Recipient) -> Unit
) {
    val input = remember { mutableStateOf("") }

    Row {
        SubtitleText(
            modifier = Modifier.padding(start = 22.dp),
            text = stringResource(id = R.string.send_to)
        )

        LazyRow(userScrollEnabled = false) {
            items(recipients) {
                RecipientCell(cell = it) {
                    onClick(it)
                }
            }
        }

        TextField(
            value = input.value,
            onValueChange = onInputChanged
        )
    }
}

@Composable
private fun RecipientCell(
    cell: Recipient,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        color = getColorSystem().surface,
        contentColor = getColorSystem().onSurface,
        elevation = 2.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AccountImage(url = cell.image)
            Text(modifier = Modifier.padding(4.dp), text = cell.email)
        }
    }
}

@Composable
fun AccountImage(
    url: String?,
) {
    val drawable = LocalContext.current.getDrawable(R.drawable.ic_baseline_account_circle_24)
    drawable?.let {
        DrawableCompat.setTint(it, getColorSystem().onSurfaceIcon.toArgb())
    }

    CoilImage(
        Modifier
            .padding(start = 4.dp)
            .size(20.dp),
        url = url,
        placeholder = drawable,
        contentDescription = stringResource(id = R.string.icon_recipient_content_description)
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewFull(
    @PreviewParameter(RecipientsProvider::class) fakeRecipientsProvider: List<Recipient>
) {
    MailAppTheme {
        SendTo(
            recipients = fakeRecipientsProvider,
            onInputChanged = { },
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCell(
    @PreviewParameter(RecipientsProvider::class) fakeRecipientsProvider: List<Recipient>
) {
    MailAppTheme {
        RecipientCell(
            cell = fakeRecipientsProvider.first(),
            modifier = Modifier.padding(10.dp),
            onClick = { }
        )
    }
}

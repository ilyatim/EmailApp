package com.unfixedbo1t.messagesending.ui.content

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.DrawableCompat
import com.unfixedbo1t.messagesending.Recipient
import com.unfixedbo1t.messagesending.ui.data.RecipientsProvider
import com.unfixedbo1t.resources.R
import com.unfixedbo1t.uikit.component.BasicBlankTextField
import com.unfixedbo1t.uikit.component.CoilImage
import com.unfixedbo1t.uikit.component.SubtitleText
import com.unfixedbo1t.uikit.theme.MailAppTheme
import com.unfixedbo1t.uikit.theme.getColorSystem

@OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalComposeUiApi::class
)
@Composable
internal fun SendTo(
    recipients: List<Recipient>,
    onInputEnd: (String) -> Unit,
    onRecipientClick: (Recipient) -> Unit
) {
    val input = remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    Column {
        Row(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
                .wrapContentHeight()
                .fillMaxWidth()
        ) {
            SubtitleText(
                modifier = Modifier
                    .padding(
                        start = 18.dp,
                    )
                    .wrapContentSize(),
                text = stringResource(id = R.string.send_to)
            )
            val onDone = {
                keyboardController?.hide()
                onInputEnd.invoke(input.value)
            }
            BasicBlankTextField(
                modifier = Modifier.padding(start = 10.dp),
                value = input.value,
                onValueChange = { newValue -> input.value = newValue },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(onDone = { onDone.invoke() })
            )
        }
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(3),
            modifier = Modifier
                .wrapContentHeight()
                .padding(start = 10.dp, end = 10.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            userScrollEnabled = false
        ) {
            items(recipients) {
                RecipientCell(cell = it) {
                    onRecipientClick(it)
                }
            }
        }
    }
}

@Composable
private fun RecipientCell(
    cell: Recipient,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    // TODO: add on click on surface
    Surface(
        modifier = modifier.wrapContentSize(),
        shape = RoundedCornerShape(10.dp),
        color = getColorSystem().surface,
        contentColor = getColorSystem().onSurface,
        elevation = 2.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AccountImage(url = cell.image)
            Text(
                modifier = Modifier.padding(4.dp),
                text = cell.email.takeIf { it.length < 15 } ?: cell.email.takeWhile { it != '@' },
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
    }
}

@Composable
fun AccountImage(
    url: String?,
) {
    val drawable = LocalContext.current.getDrawable(R.drawable.ic_baseline_account_circle_24)
    drawable?.let {
        // TODO: fix bug with an immutable color
        val color = getColorSystem().onSurface
        DrawableCompat.setTint(it, color.toArgb())
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
            onInputEnd = { },
            onRecipientClick = { }
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
            onClick = { }
        )
    }
}

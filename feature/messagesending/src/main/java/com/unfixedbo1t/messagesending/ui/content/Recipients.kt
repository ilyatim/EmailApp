package com.unfixedbo1t.messagesending.ui.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.DrawableCompat
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.unfixedbo1t.messagesending.Recipient
import com.unfixedbo1t.resources.R
import com.unfixedbo1t.uikit.component.SubtitleText
import com.unfixedbo1t.uikit.theme.getColorSystem

@Composable
internal fun SendTo(
    recipients: List<Recipient>,
    onClick: (Recipient) -> Unit
) {
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
            CoilImage(url = cell.image)
            Text(modifier = Modifier.padding(4.dp), text = cell.email)
        }
    }
}

// TODO: move in ui kit
@Composable
private fun CoilImage(
    url: String?,
) {
    val drawable = LocalContext.current.getDrawable(R.drawable.ic_baseline_account_circle_24)
    drawable?.let {
        DrawableCompat.setTint(it, getColorSystem().onSurfaceIcon.toArgb())
    }

    val request = ImageRequest.Builder(LocalContext.current)
        .data(url)
        .placeholder(drawable)
        .crossfade(false)
        .build()

    val painter = rememberAsyncImagePainter(model = request)
    Image(
        modifier = Modifier
            .padding(start = 4.dp)
            .size(20.dp),
        painter = painter,
        contentScale = ContentScale.FillBounds,
        contentDescription = stringResource(id = R.string.icon_recipient_content_description)
    )
}

// TODO: change on provide preview
@Preview(showBackground = true)
@Composable
private fun Preview() {
    RecipientCell(
        cell = Recipient(
            1,
            "sometest@mail.ru",
        ),
        modifier = Modifier.padding(10.dp)
    ) {
    }
    // SendTo(recipients =)
}

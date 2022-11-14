package com.unfixedbo1t.uikit.component

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun CoilImage(
    modifier: Modifier = Modifier,
    url: String?,
    placeholder: Drawable?,
    contentDescription: String? = null
) {
    val request = ImageRequest.Builder(LocalContext.current)
        .data(url)
        .placeholder(placeholder)
        .crossfade(false)
        .build()
    val painter = rememberAsyncImagePainter(model = request)
    Image(
        modifier = modifier,
        painter = painter,
        contentScale = ContentScale.FillBounds,
        contentDescription = contentDescription
    )
}

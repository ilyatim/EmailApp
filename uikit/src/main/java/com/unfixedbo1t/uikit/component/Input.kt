package com.unfixedbo1t.uikit.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle

@Composable
fun HintTextField(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    textStyle: TextStyle = LocalTextStyle.current,
    cursorBrush: Brush = SolidColor(MaterialTheme.colors.onBackground),
    placeholder: @Composable (() -> Unit)? = null
) {
    Box(modifier = modifier) {
        BasicTextField(
            value = value,
            onValueChange = { onValueChange(it) },
            textStyle = textStyle,
            cursorBrush = cursorBrush,
        )
        if (value.isEmpty()) {
            placeholder?.invoke()
        }
    }
}
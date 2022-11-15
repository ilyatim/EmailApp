package com.unfixedbo1t.uikit.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle

@Composable
fun BlankHintTextField(
    modifier: Modifier = Modifier,
    value: String,
    hintValue: String,
    onValueChange: (String) -> Unit,
    textStyle: TextStyle = LocalTextStyle.current,
    cursorBrush: Brush = SolidColor(MaterialTheme.colors.onBackground)
) {
    HintTextField(
        modifier = modifier,
        value = value,
        hintValue = hintValue,
        onValueChange = onValueChange,
        textStyle = textStyle.copy(color = MaterialTheme.colors.onBackground),
        cursorBrush = cursorBrush
    )
}

@Composable
fun HintTextField(
    modifier: Modifier = Modifier,
    value: String,
    hintValue: String,
    onValueChange: (String) -> Unit,
    textStyle: TextStyle = LocalTextStyle.current,
    cursorBrush: Brush = SolidColor(MaterialTheme.colors.onBackground)
) {
    // TODO: change hint text color
    PlaceholderTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        textStyle = textStyle,
        cursorBrush = cursorBrush
    ) {
        SubtitleText(text = hintValue)
    }
}

@Composable
fun PlaceholderTextField(
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

@Composable
fun BasicBlankTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    maxLines: Int = 1,
    singleLine: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    textStyle: TextStyle = LocalTextStyle.current,
    cursorBrush: Brush = SolidColor(MaterialTheme.colors.onBackground)
) {
    BasicTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        textStyle = textStyle.copy(color = MaterialTheme.colors.onBackground),
        cursorBrush = cursorBrush,
        maxLines = maxLines,
        singleLine = singleLine,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions
    )
}

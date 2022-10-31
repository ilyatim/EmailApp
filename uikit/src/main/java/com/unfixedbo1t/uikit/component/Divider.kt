package com.unfixedbo1t.uikit.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import com.unfixedbo1t.uikit.theme.Gray808080

@Composable
fun LineDivider(
    modifier: Modifier = Modifier,
    lineColor: Color = Gray808080
) {
    Divider(
        color = lineColor,
        modifier = modifier
            .fillMaxWidth()
            .alpha(0.3f)
    )
}
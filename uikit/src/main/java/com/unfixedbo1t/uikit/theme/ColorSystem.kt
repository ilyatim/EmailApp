package com.unfixedbo1t.uikit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

sealed interface ColorSystem {
    val primary: Color
    val primaryVariant: Color
    val secondary: Color
    val secondaryVariant: Color
    val background: Color
    val surface: Color
    val error: Color
    val onPrimary: Color
    val onSecondary: Color
    val onBackground: Color
    val onSurface: Color
    val onError: Color
    val titleText: Color
    val subtitleText: Color
    val onSurfaceIcon: Color
}

object LightColorSystem : ColorSystem {
    override val primary: Color = Color.White
    override val primaryVariant: Color = Color.White
    override val secondary: Color = Blue66A4ED
    override val secondaryVariant: Color = Blue66A4ED
    override val background: Color = Color.White
    override val surface: Color = GrayEAEAEA
    override val error: Color = Color.Red
    override val onPrimary: Color = Gray808080
    override val onSecondary: Color = GrayEAEAEA
    override val onBackground: Color = Gray808080
    override val onSurface: Color = Blue66A4ED
    override val onError: Color = Color.White

    // TODO
    override val titleText: Color = Color.Black
    override val subtitleText: Color = Gray808080
    override val onSurfaceIcon: Color = GrayC9C9C9
}

object DarkColorSystem : ColorSystem {
    override val primary: Color = DarkBlue0B192F
    override val primaryVariant: Color = DarkBlue0B192F
    override val secondary: Color = Blue162B46
    override val secondaryVariant: Color = Blue162B46
    override val background: Color = DarkBlue0B192F
    override val surface: Color = Blue162B46
    override val error: Color = Color.Red // TODO: change red color
    override val onPrimary: Color = Color.White
    override val onSecondary: Color = Blue66A4ED
    override val onBackground: Color = Color.White
    override val onSurface: Color = Blue66A4ED
    override val onError: Color = Color.White // TODO: change red color

    // TODO
    override val titleText: Color = Color.White
    override val subtitleText: Color = Gray808080
    override val onSurfaceIcon: Color = Color.White
}

@Composable
fun getColorSystem(): ColorSystem {
    return if (isSystemInDarkTheme()) {
        DarkColorSystem
    } else {
        LightColorSystem
    }
}

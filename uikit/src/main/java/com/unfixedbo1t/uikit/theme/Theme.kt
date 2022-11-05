package com.unfixedbo1t.uikit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkColorSystem.primary,
    primaryVariant = DarkColorSystem.primaryVariant,
    secondary = DarkColorSystem.secondaryVariant,
    secondaryVariant = DarkColorSystem.secondaryVariant,
    background = DarkColorSystem.background,
    surface = DarkColorSystem.surface,
    error = DarkColorSystem.error,
    onPrimary = DarkColorSystem.onPrimary,
    onSecondary = DarkColorSystem.onSecondary,
    onBackground = DarkColorSystem.onBackground,
    onSurface = DarkColorSystem.onSurface,
    onError = DarkColorSystem.onError,
)
private val LightColorPalette = lightColors(
    primary = LightColorSystem.primary,
    primaryVariant = LightColorSystem.primaryVariant,
    secondary = LightColorSystem.secondaryVariant,
    secondaryVariant = LightColorSystem.secondaryVariant,
    background = LightColorSystem.background,
    surface = LightColorSystem.surface,
    error = LightColorSystem.error,
    onPrimary = LightColorSystem.onPrimary,
    onSecondary = LightColorSystem.onSecondary,
    onBackground = LightColorSystem.onBackground,
    onSurface = LightColorSystem.onSurface,
    onError = LightColorSystem.onError,
)

@Composable
fun MailAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

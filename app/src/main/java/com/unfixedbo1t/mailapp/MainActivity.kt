package com.unfixedbo1t.mailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.unfixedbo1t.mailapp.navigation.AppNavHost
import com.unfixedbo1t.messagesending.navigation.SEND_MESSAGE_ROUTE
import com.unfixedbo1t.messagesending.navigation.navigateToMessageSending
import com.unfixedbo1t.uikit.theme.MailAppTheme
import com.unfixedbo1t.uikit.theme.getColorSystem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO: add splash screen
        //WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val systemUiController = rememberSystemUiController()
            val isDarkTheme = isSystemInDarkTheme()

            systemUiController.setNavigationBarColor(getColorSystem().background)
            systemUiController.setStatusBarColor(getColorSystem().background)

            DisposableEffect(systemUiController) {
                systemUiController.systemBarsDarkContentEnabled = !isDarkTheme
                onDispose {}
            }
            MailAppTheme {
                EmailApp()
            }
        }
    }
}
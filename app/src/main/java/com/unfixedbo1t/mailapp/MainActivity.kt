package com.unfixedbo1t.mailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.unfixedbo1t.mailapp.navigation.AppNavHost
import com.unfixedbo1t.messagesending.navigation.SEND_MESSAGE_ROUTE
import com.unfixedbo1t.messagesending.navigation.navigateToMessageSending
import com.unfixedbo1t.uikit.theme.MailAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO: add splash screen
        setContent {
            MailAppTheme {
                EmailApp()
            }
        }
    }
}
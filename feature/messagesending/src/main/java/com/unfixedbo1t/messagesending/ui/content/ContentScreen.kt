package com.unfixedbo1t.messagesending.ui.content

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unfixedbo1t.uikit.component.HintTextField
import com.unfixedbo1t.uikit.component.LineDivider

@Composable
internal fun ContentSendMessageScreen(
    modifier: Modifier = Modifier,
    onCancelClick: () -> Unit,
    onSendClick: () -> Unit
) {
    val scaffoldState = rememberScaffoldState()
    val inputSubject = remember { mutableStateOf("") }
    
    Scaffold(
        modifier = Modifier,
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                onCancelClick = onCancelClick,
                onSendClick = onSendClick
            )
        },
        floatingActionButton = {
            SendMessageFloatingButton()
        },
        backgroundColor = MaterialTheme.colors.background
    ) { paddingValues ->
        Column {
            SendTo()
            
            LineDivider(Modifier.padding(top = 10.dp))
            
            HintTextField(
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp, start = 22.dp, end = 22.dp),
                value = inputSubject.value,
                onValueChange = { newValue -> inputSubject.value = newValue },
                textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colors.onBackground)
            ) {
                Text(text = "input here")
            }
            
            LineDivider(Modifier.padding(top = 10.dp))
            
            LazyColumn {

            }
        }
    }
}

@Composable
private fun SendTo() {
    Row {
        Text(modifier = Modifier.padding(start = 22.dp), text = "some")
        Text(modifier = Modifier.padding(start = 22.dp), text = "some")
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun Preview() {
    ContentSendMessageScreen(
        onCancelClick = {},
        onSendClick = {}
    )
}

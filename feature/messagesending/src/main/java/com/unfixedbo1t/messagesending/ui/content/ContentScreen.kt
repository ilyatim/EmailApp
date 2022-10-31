package com.unfixedbo1t.messagesending.ui.content

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unfixedbo1t.uikit.component.LineDivider

@Composable
internal fun ContentSendMessageScreen(
    modifier: Modifier = Modifier,
    onCancelClick: () -> Unit,
    onSendClick: () -> Unit
) {
    val scaffoldState = rememberScaffoldState()
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
            Text(modifier = Modifier.padding(top = 22.dp, start = 22.dp), text = "some long text for testing")
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

package com.unfixedbo1t.messagesending.ui.content

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unfixedbo1t.messagesending.Recipient
import com.unfixedbo1t.resources.R
import com.unfixedbo1t.uikit.component.HintTextField
import com.unfixedbo1t.uikit.component.LineDivider

@Composable
internal fun ContentSendMessageScreen(
    modifier: Modifier = Modifier,
    recipients: List<Recipient>,
    onCancelClick: () -> Unit,
    onSendClick: () -> Unit
) {
    val scaffoldState = rememberScaffoldState()
    val inputSubject = remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
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
            SendTo(recipients) {
            }

            LineDivider(Modifier.padding(top = 10.dp))

            HintTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 16.dp,
                        start = 22.dp,
                        end = 22.dp
                    ),
                value = inputSubject.value,
                hintValue = stringResource(id = R.string.input_here),
                onValueChange = { newValue -> inputSubject.value = newValue },
            )

            LineDivider(Modifier.padding(top = 10.dp))

            LazyColumn {
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    ContentSendMessageScreen(
        onCancelClick = {},
        onSendClick = {},
        recipients = listOf()
    )
}

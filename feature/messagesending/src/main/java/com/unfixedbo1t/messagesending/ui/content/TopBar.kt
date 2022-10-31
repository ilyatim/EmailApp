package com.unfixedbo1t.messagesending.ui.content

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unfixedbo1t.resources.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun TopBar(
    onCancelClick: () -> Unit,
    onSendClick: () -> Unit
) {
    Surface(
        color = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground
    ) {
        CompositionLocalProvider(LocalMinimumTouchTargetEnforcement provides false) {
            Row(
                modifier = Modifier.padding(22.dp)
            ) {
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onCancelClick,
                    enabled = true,
                ) {
                    Icon(
                        Icons.Default.Clear,
                        contentDescription = stringResource(id = R.string.icon_cancel_content_description)
                    )
                }
                Spacer(modifier = Modifier.weight(1f, true))
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onSendClick,
                    enabled = true
                ) {
                    Icon(
                        Icons.Default.Send,
                        contentDescription = stringResource(id = R.string.icon_send_content_description)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun Preview() {
    TopBar(
        onCancelClick = {},
        onSendClick = {}
    )
}
package com.unfixedbo1t.uikit.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unfixedbo1t.uikit.theme.MailAppTheme
import com.unfixedbo1t.uikit.theme.getColorSystem

@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
) {
    Text(
        text = text,
        color = getColorSystem().titleText,
        modifier = modifier,
        fontSize = 16.sp,
        letterSpacing = letterSpacing,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines,
    )
}

@Composable
fun SubtitleText(
    text: String,
    modifier: Modifier = Modifier,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
) {
    Text(
        text = text,
        color = getColorSystem().subtitleText,
        modifier = modifier,
        fontSize = 14.sp,
        letterSpacing = letterSpacing,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines,
    )
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TitleTextPreview() {
    MailAppTheme {
        Surface {
            TitleText(text = "Some test title", modifier = Modifier.padding(10.dp))
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SubtitleTextPreview() {
    MailAppTheme {
        Surface {
            SubtitleText(text = "some subtitle text", modifier = Modifier.padding(10.dp))
        }
    }
}

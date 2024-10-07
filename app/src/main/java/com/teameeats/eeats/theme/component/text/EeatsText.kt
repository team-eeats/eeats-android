package com.teameeats.eeats.theme.component.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun EeatsText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    style: TextStyle,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration = TextDecoration.None,
) {
    Text(
        modifier = modifier,
        text = text,
        color = color,
        style = style,
        overflow = overflow,
        maxLines = maxLines,
        textAlign = textAlign,
        textDecoration = textDecoration,
    )
}

package com.teameeats.eeats.theme.component.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun EeatsButton(
    modifier: Modifier,
    color: Color,
    enabled: Boolean,
    radius: Dp? = 8.dp,
    contentPadding: Modifier,
    keyboardInteractionEnabled: Boolean,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    var pressed by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(radius!!),
        color = color,
        onClick = onClick,
    ) {
        Box(
            modifier = contentPadding,
            contentAlignment = Alignment.Center // 가운데 정렬
        ) {
            content()
        }
    }
}

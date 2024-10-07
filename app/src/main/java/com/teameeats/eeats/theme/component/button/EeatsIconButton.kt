package com.teameeats.eeats.theme.component.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun EeatsIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    @DrawableRes drawableResId: Int,
    contentDescription: String,
    color: Color,
) {
    Icon(
        modifier = modifier.clickable(onClick = onClick),
        painter = painterResource(drawableResId),
        contentDescription = contentDescription,
        tint = color,
    )
}

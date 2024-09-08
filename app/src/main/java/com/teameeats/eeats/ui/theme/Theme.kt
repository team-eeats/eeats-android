package com.teameeats.eeats.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun EeatsTheme(
    colors: Color = EeatsColor,
    typography: Typography = EeatsTypography,
    content: @Composable (colors: Color, typography: Typography) -> Unit
) {
    content(colors, typography)
}

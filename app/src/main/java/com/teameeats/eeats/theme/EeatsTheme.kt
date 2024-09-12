package com.teameeats.feature.theme

import androidx.compose.runtime.Composable

@Composable
fun EeatsTheme(
    colors: Color = EeatsColor,
    typography: Typography = EeatsTypography,
    content: @Composable (colors: Color, typography: Typography) -> Unit
) {
    content(colors, typography)
}

package com.teameeats.eeats.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class Color(
    val white: Color,
    val black: Color,

    val gray0: Color,
    val gray50: Color,
    val gray100: Color,
    val gray200: Color,
    val gray300: Color,
    val gray400: Color,
    val gray500: Color,
    val gray600: Color,
    val gray700: Color,
    val gray800: Color,
    val gray900: Color,

    val main0: Color,
    val main50: Color,
    val main100: Color,
    val main200: Color,
    val main300: Color,
    val main400: Color,
    val main500: Color,
    val main600: Color,
    val main700: Color,
    val main800: Color,
)

val EeatsColor = Color(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF000000),

    gray0 = Color(0xFFF3F3F3),
    gray50 = Color(0xFFEDEDED),
    gray100 = Color(0xFFD2D2D2),
    gray200 = Color(0xFFB4B4B4),
    gray300 = Color(0xFF959595),
    gray400 = Color(0xFF7F7F7F),
    gray500 = Color(0xFF686868),
    gray600 = Color(0xFF606060),
    gray700 = Color(0xFF555555),
    gray800 = Color(0xFF4B4B4B),
    gray900 = Color(0xFF3A3A3A),

    main0 = Color(0xFFFFFAF9),
    main50 = Color(0xFFFFE7E3),
    main100 = Color(0xFFFFC4BA),
    main200 = Color(0xFFFF9D8C),
    main300 = Color(0xFFFF765D),
    main400 = Color(0xFFFF583B),
    main500 = Color(0xFFFF3B18),
    main600 = Color(0xFFFF3515),
    main700 = Color(0xFFFF260E),
    main800 = Color(0xFFFF1908)
)

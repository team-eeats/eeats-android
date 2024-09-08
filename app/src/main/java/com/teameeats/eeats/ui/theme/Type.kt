package com.teameeats.eeats.ui.theme

import com.teameeats.eeats.R
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val pretendard: FontFamily = FontFamily(
    Font(
        resId = R.font.pretendard_semi_bold,
        weight = FontWeight.SemiBold,
    ),
    Font(
        resId = R.font.pretendard_medium,
        weight = FontWeight.Medium,
    ),
    Font(
        resId = R.font.pretendard_regular,
        weight = FontWeight.Normal,
    ),
)

val EeatsTypography = Typography(
    heading1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 42.sp,
    ),
    heading2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
    ),
    heading3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
    ),
    heading4 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),
    subTitle1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
    ),
    subTitle2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
    ),
    subTitle3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
    ),
    body1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
    ),
    body2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    body3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
    body4 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
    ),
    caption1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),
    caption2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    caption3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    label1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
    ),
    label2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    label3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    ),
    button1 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
    ),
    button2 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
    ),
    button3 = TextStyle(
        fontFamily = pretendard,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
    )
)

@Immutable
data class Typography(
    val heading1: TextStyle,
    val heading2: TextStyle,
    val heading3: TextStyle,
    val heading4: TextStyle,

    val subTitle1: TextStyle,
    val subTitle2: TextStyle,
    val subTitle3: TextStyle,

    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val body4: TextStyle,

    val caption1: TextStyle,
    val caption2: TextStyle,
    val caption3: TextStyle,

    val label1: TextStyle,
    val label2: TextStyle,
    val label3: TextStyle,

    val button1: TextStyle,
    val button2: TextStyle,
    val button3: TextStyle,
)

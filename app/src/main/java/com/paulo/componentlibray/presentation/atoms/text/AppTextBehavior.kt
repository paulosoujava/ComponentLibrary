package com.paulo.componentlibray.presentation.atoms.text


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.paulo.componentlibray.presentation.ui.theme.disabledColor
import com.paulo.componentlibray.presentation.ui.theme.errorColor
import com.paulo.componentlibray.presentation.ui.theme.infoColor
import com.paulo.componentlibray.presentation.ui.theme.primaryTextColor
import com.paulo.componentlibray.presentation.ui.theme.warningColor

enum class AppTextBehavior(
    val style: TextStyle
) {
    REGULAR(
        style = TextStyle(
            color = primaryTextColor,
            fontSize = 16.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
        )
    ),
    ERROR(
        style = TextStyle(
            color = errorColor, fontSize = 17.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,

            )
    ),
    WARNING(
        style = TextStyle(
            color = warningColor, fontSize = 17.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
        )
    ),
    INFO(
        style = TextStyle(
            color = infoColor, fontSize = 17.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
        )
    ),
    DISABLED(
        style = TextStyle(
            color = disabledColor, fontSize = 16.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
        )
    ),
}
package com.paulo.componentlibray.presentation.design.atoms.text


import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.paulo.componentlibray.presentation.design.ui.theme.disabledColor
import com.paulo.componentlibray.presentation.design.ui.theme.firaSansFamily
import com.paulo.componentlibray.presentation.design.ui.theme.infoColor
import com.paulo.componentlibray.presentation.design.ui.theme.primaryTextColor
import com.paulo.componentlibray.presentation.design.ui.theme.white

enum class AppTextBehavior(
    val style: TextStyle
) {
    H1(
        style = TextStyle(
            color = primaryTextColor,
            fontSize = 21.sp,
            fontFamily = firaSansFamily,
            fontWeight = FontWeight.Bold
        )
    ),
    TITLE(
        style = TextStyle(
            color = primaryTextColor, fontSize = 18.sp,
            fontFamily = firaSansFamily,
            fontWeight = FontWeight.Medium

        )
    ),
    TITLE_BUTTON(
        style = TextStyle(
            color = white, fontSize = 16.sp,
            fontFamily = firaSansFamily,
            fontWeight = FontWeight.Thin

        )
    ),
    SUBTITLE(
        style = TextStyle(
            color = primaryTextColor, fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
        )
    ),
    INFO(
        style = TextStyle(
            color = infoColor, fontSize = 17.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
        )
    ),
    WARNING(
        style = TextStyle(
            color = infoColor, fontSize = 17.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
        )
    ),
    ERROR(
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
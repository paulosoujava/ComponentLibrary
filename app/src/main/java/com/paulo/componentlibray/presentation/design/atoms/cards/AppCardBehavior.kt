package com.paulo.componentlibray.presentation.design.atoms.cards


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.paulo.componentlibray.presentation.design.ui.theme.errorColor
import com.paulo.componentlibray.presentation.design.ui.theme.infoColor
import com.paulo.componentlibray.presentation.design.ui.theme.primaryColor

enum class AppCardBehavior(
    val widthBorder: Dp,
    val colorBorder: Color,
    val elevation: Dp
) {
    RERGULAR(
        widthBorder = 1.dp,
        elevation = 12.dp,
        colorBorder = primaryColor
    ),
    ERROR(
        widthBorder = 1.dp,
        elevation = 12.dp,
        colorBorder = errorColor
    ),
    INFO(
        widthBorder = 1.dp,
        elevation = 12.dp,
        colorBorder = infoColor
    )
}
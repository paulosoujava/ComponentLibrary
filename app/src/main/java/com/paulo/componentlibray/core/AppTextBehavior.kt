package com.paulo.componentlibray.core


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.paulo.componentlibray.presentation.ui.theme.disabledColor
import com.paulo.componentlibray.presentation.ui.theme.errorColor
import com.paulo.componentlibray.presentation.ui.theme.infoColor
import com.paulo.componentlibray.presentation.ui.theme.primaryTextColor
import com.paulo.componentlibray.presentation.ui.theme.warningColor

enum class AppTextBehavior(
    val color: Color,
    val fontSize: TextUnit
) {
    REGULAR(color = primaryTextColor, fontSize = 13.sp),
    ERROR(color = errorColor, fontSize = 13.sp),
    WARNING(color = warningColor, fontSize = 13.sp),
    INFO(color = infoColor, fontSize = 13.sp),
    DISABLED(color = disabledColor, fontSize = 13.sp),
}
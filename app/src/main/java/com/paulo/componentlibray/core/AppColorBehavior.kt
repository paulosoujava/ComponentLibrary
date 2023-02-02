package com.paulo.componentlibray.core

import androidx.compose.ui.graphics.Color
import com.paulo.componentlibray.presentation.ui.theme.disabledColor
import com.paulo.componentlibray.presentation.ui.theme.errorColor
import com.paulo.componentlibray.presentation.ui.theme.infoColor
import com.paulo.componentlibray.presentation.ui.theme.primaryColor
import com.paulo.componentlibray.presentation.ui.theme.warningColor

enum class AppColorBehavior(
    val color: Color
) {
    RERGULAR(color = primaryColor),
    ERROR(color = errorColor),
    DISBALED(color = disabledColor),
    LAODING(color = disabledColor),
    INFO(color = infoColor),
    WARNING(color = warningColor),
}
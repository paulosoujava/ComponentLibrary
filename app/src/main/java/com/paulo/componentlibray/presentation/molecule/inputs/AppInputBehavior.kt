package com.paulo.componentlibray.presentation.molecule.inputs


import androidx.compose.ui.graphics.Color


import com.paulo.componentlibray.presentation.ui.theme.black
import com.paulo.componentlibray.presentation.ui.theme.errorColor
import com.paulo.componentlibray.presentation.ui.theme.white


enum class AppInputBehavior(
    val focusedBorderColor: Color,
    val unfocusedBorderColor: Color,
    val textColor: Color,
    val cursorColor: Color,
) {
    REGULAR(
        focusedBorderColor = black,
        unfocusedBorderColor = black.copy(alpha = .1f),
        textColor = black,
        cursorColor = white,
    ),
    ERROR(
        focusedBorderColor = errorColor,
        unfocusedBorderColor = errorColor.copy(alpha = .1f),
        textColor = black,
        cursorColor = white,
    )
}






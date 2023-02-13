package com.paulo.componentlibray.presentation.design.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


//COMPONENTS COLORS APP
val errorColor = Color(0xFFF44336)
val disabledColor = Color(0xFFA3A3A3)
val infoColor = Color(0xFF6200EE)
val warningColor = Color(0xFFf57c00)

val white = Color(0xFFffffff)
val black = Color(0xFF000000)

val primaryColor = Color(0xFFf57c00)
val primaryLightColor = Color(0xFFffad42)
val primaryDarkColor = Color(0xFFbb4d00)
val primaryTextColor = Color(0xFF000000)

val transparent = Color.Transparent

enum class AppColorBehavior(
    val color: Color
) {
    RERGULAR(color = primaryColor),
    ERROR(color = errorColor),
    DISBALED(color = disabledColor),
    LAODING(color = disabledColor),
    INFO(color = infoColor),
    WARNING(color = warningColor),
    TRASPARENT(color = transparent),
}
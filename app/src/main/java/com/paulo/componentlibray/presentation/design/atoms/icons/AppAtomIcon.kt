package com.paulo.componentlibray.presentation.design.atoms.icons

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.paulo.componentlibray.presentation.design.ui.theme.white

@Composable
fun AppIcon(
    modifier: Modifier = Modifier,
    behavior: AppIconBehavior,
    color: Color = white

) {
    Icon(
        modifier = modifier,
        imageVector = behavior.icon,
        contentDescription = behavior.description,
         tint = color
    )
}
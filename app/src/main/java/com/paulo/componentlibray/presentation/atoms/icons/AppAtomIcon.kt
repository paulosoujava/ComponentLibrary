package com.paulo.componentlibray.presentation.atoms.icons

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.paulo.componentlibray.presentation.atoms.icons.AppIconBehavior
import com.paulo.componentlibray.presentation.ui.theme.white

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
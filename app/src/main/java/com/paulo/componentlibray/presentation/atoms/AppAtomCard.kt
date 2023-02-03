package com.paulo.componentlibray.presentation.atoms

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.paulo.componentlibray.behaviors.AppCardBehavior
import com.paulo.componentlibray.behaviors.AppColorBehavior

@Composable
fun AppAtomCard(
    modifier: Modifier,
    appCardBehavior:AppCardBehavior,
    appColorBehavior: AppColorBehavior,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        elevation = appCardBehavior.elevation,
        border =  BorderStroke(appCardBehavior.widthBorder, appCardBehavior.colorBorder),
        backgroundColor = appColorBehavior.color,
        content = content
    )
}
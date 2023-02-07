package com.paulo.componentlibray.presentation.atoms.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.paulo.componentlibray.presentation.atoms.cards.AppCardBehavior
import com.paulo.componentlibray.presentation.ui.theme.AppColorBehavior

@Composable
fun AppAtomCard(
    modifier: Modifier,
    appCardBehavior: AppCardBehavior,
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
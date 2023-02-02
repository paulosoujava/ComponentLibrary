package com.paulo.componentlibray.presentation.atoms

import androidx.compose.foundation.background
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.paulo.componentlibray.core.AppColorBehavior

@Composable
fun AppButtonIcon(
    modifier: Modifier = Modifier,
    behavior: AppColorBehavior,
    slot: @Composable () -> Unit,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.background(behavior.color)
    ) {
        slot()
    }
}
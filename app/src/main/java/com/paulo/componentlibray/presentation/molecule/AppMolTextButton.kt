package com.paulo.componentlibray.presentation.molecule

import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.paulo.componentlibray.presentation.atoms.text.AppText
import com.paulo.componentlibray.presentation.atoms.text.AppTextBehavior

@Composable
fun AppMolTextButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit
) {
    TextButton(onClick = onClick, modifier = modifier) {
        AppText(label = label, behavior  = AppTextBehavior.REGULAR)
    }
}
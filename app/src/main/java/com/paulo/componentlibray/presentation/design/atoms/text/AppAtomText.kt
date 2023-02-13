package com.paulo.componentlibray.presentation.design.atoms.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun AppText(
    modifier: Modifier = Modifier,
    label: String,
    behavior: AppTextBehavior,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = label,
        modifier = modifier,
        textAlign = textAlign,
        style = behavior.style
    )
}
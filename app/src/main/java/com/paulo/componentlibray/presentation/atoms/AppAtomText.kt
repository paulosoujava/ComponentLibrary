package com.paulo.componentlibray.presentation.atoms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.paulo.componentlibray.behaviors.AppTextBehavior


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
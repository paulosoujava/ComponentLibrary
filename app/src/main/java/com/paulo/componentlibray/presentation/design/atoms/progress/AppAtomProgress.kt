package com.paulo.componentlibray.presentation.design.atoms.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.paulo.componentlibray.presentation.design.ui.theme.AppColorBehavior


@Composable
fun AppProgress(
    appColorBehavior: AppColorBehavior
) {

    CircularProgressIndicator(
        modifier = Modifier.size(20.dp).background(appColorBehavior.color)
    )
}
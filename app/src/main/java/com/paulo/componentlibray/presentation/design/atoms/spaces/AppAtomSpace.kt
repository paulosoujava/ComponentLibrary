package com.paulo.componentlibray.presentation.design.atoms.spaces

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppAtomSpaceHeight(appSizeBehavior: AppSizeBehavior) {
    Spacer(modifier = Modifier.height(appSizeBehavior.space))
}
@Composable
fun AppAtomSpaceWidth(appSizeBehavior: AppSizeBehavior) {
    Spacer(modifier = Modifier.width(appSizeBehavior.space))
}
@Composable
fun AppAtomSpaceSize(appSizeBehavior: AppSizeBehavior) {
    Spacer(modifier = Modifier.size(appSizeBehavior.space))
}

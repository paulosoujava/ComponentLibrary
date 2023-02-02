package com.paulo.componentlibray.presentation.molecule

import androidx.compose.runtime.Composable
import com.paulo.componentlibray.core.AppColorBehavior
import com.paulo.componentlibray.core.AppIconBehavior
import com.paulo.componentlibray.presentation.atoms.AppButtonIcon
import com.paulo.componentlibray.presentation.atoms.AppIcon
import com.paulo.componentlibray.presentation.atoms.AppProgress


@Composable
fun AppMolIconButton(
    appColorBehavior: AppColorBehavior,
    appIconBehavior: AppIconBehavior,
    onClick: (String) -> Unit
) {
    AppButtonIcon(behavior = appColorBehavior,
        slot = {
            if (appColorBehavior == AppColorBehavior.LAODING) {
                AppProgress(appColorBehavior = appColorBehavior)
            } else
                AppIcon(behavior = appIconBehavior)
        }) {
        onClick(appIconBehavior.description)
    }
}
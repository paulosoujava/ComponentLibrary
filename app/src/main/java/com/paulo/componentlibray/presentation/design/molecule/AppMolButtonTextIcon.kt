package com.paulo.componentlibray.presentation.design.molecule

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.paulo.componentlibray.presentation.design.atoms.icons.AppIconBehavior
import com.paulo.componentlibray.presentation.design.atoms.icons.AppIcon
import com.paulo.componentlibray.presentation.design.atoms.text.AppText
import com.paulo.componentlibray.presentation.design.atoms.text.AppTextBehavior


@Composable
fun AppMolButtonTextIcon(
    labelButton: String,
    behavior: AppIconBehavior,
    onClick: () -> Unit
) {
    Button(onClick = onClick,
        modifier = Modifier.padding(end = 24.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            AppText(
                label = labelButton,
                behavior = AppTextBehavior.TITLE,
                modifier = Modifier.weight(5f)
            )
            AppIcon(behavior = behavior)
        }

    }
}
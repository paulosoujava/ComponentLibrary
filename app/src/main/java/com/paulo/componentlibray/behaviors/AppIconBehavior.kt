package com.paulo.componentlibray.behaviors

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppIconBehavior(
    val icon: ImageVector, val description: String
) {
    BACK(icon = Icons.Default.ArrowBack, description = "Back Icon"),
    INFO(icon = Icons.Default.Info, description = "Info Icon"),
    WARNING(icon = Icons.Default.Warning, description = "Warning Icon"),
    CLOSE(icon = Icons.Default.Close, description = "Close Icon"),
    ERROR(icon = Icons.Default.Build, description = "Error Icon"),
    DISABLED(icon = Icons.Default.Lock, description = "Error Icon"),
}
package com.paulo.componentlibray.presentation

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.window.layout.WindowMetricsCalculator
import com.paulo.componentlibray.presentation.design.page.AppPageLogin
import com.paulo.componentlibray.presentation.design.page.AppPageRegister
import com.paulo.componentlibray.presentation.design.ui.theme.ComponentLibrayTheme

enum class WindowSizeClass { Compact, Medium, Expanded }

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentLibrayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val (width, height) = computeWindowSizeClasses(this)
                    when (width) {
                        WindowSizeClass.Expanded -> {
                            when (height) {
                                WindowSizeClass.Compact -> Text(text = "Expanded X Compact")
                                WindowSizeClass.Medium -> Text(text = "Expanded X Medium")
                                WindowSizeClass.Expanded -> ExpandedExpanded()
                            }
                        }
                        WindowSizeClass.Compact -> when (height) {
                            WindowSizeClass.Compact -> Text(text = "Compact X Compact")
                            WindowSizeClass.Medium -> Text(text = "Compact X Medium")
                            WindowSizeClass.Expanded -> Text(text = "Compact X Expanded")
                        }
                        WindowSizeClass.Medium -> when (height) {
                            WindowSizeClass.Compact -> Text(text = "Medium X Compact")
                            WindowSizeClass.Medium -> Text(text = "Medium X Medium")
                            WindowSizeClass.Expanded -> Text(text = "Medium X Expanded")
                        }
                    }

                }
            }
        }
    }
}

private fun computeWindowSizeClasses(context: Activity): Pair<WindowSizeClass, WindowSizeClass> {
    val metrics = WindowMetricsCalculator.getOrCreate()
        .computeCurrentWindowMetrics(context)

    val widthDp = metrics.bounds.width() / context.resources.displayMetrics.density
    val widthWindowSizeClass = when {
        widthDp < 600f -> WindowSizeClass.Compact
        widthDp < 840f -> WindowSizeClass.Medium
        else -> WindowSizeClass.Expanded
    }

    val heightDp = metrics.bounds.height() / context.resources.displayMetrics.density

    val heightWindowSizeClass = when {
        heightDp < 480f -> WindowSizeClass.Compact
        heightDp < 900f -> WindowSizeClass.Medium
        else -> WindowSizeClass.Expanded
    }

    return Pair(widthWindowSizeClass, heightWindowSizeClass)
}

@Composable
fun ExpandedExpanded() {
    Row(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppPageLogin()
        }
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
                .background(Color.Gray)
                .padding(top = 8.dp, bottom = 8.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppPageRegister()
        }
    }
}
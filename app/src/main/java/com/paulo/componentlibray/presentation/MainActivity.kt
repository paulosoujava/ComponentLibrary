package com.paulo.componentlibray.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.paulo.componentlibray.presentation.page.AppPageLogin
import com.paulo.componentlibray.presentation.ui.theme.ComponentLibrayTheme
import com.paulo.componentlibray.presentation.ui.theme.black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentLibrayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = black
                ) {
                    AppPageLogin()

                }
            }
        }
    }
}

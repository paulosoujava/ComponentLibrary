package com.paulo.componentlibray.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.paulo.componentlibray.core.AppColorBehavior
import com.paulo.componentlibray.core.AppIconBehavior
import com.paulo.componentlibray.core.AppTextBehavior
import com.paulo.componentlibray.presentation.atoms.AppButtonIcon
import com.paulo.componentlibray.presentation.atoms.AppIcon
import com.paulo.componentlibray.presentation.atoms.AppText
import com.paulo.componentlibray.presentation.molecule.AppMolIconButton
import com.paulo.componentlibray.presentation.ui.theme.ComponentLibrayTheme
import com.paulo.componentlibray.presentation.ui.theme.black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentLibrayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    LazyColumn {
                        items(AppTextBehavior.values()) { behavior ->
                            AppText(label = behavior.toString(), behavior = behavior)
                        }
                        items(AppIconBehavior.values()) { behavior ->
                            AppIcon(behavior = behavior, color = black)
                        }
                        items(AppColorBehavior.values()) { behavior ->
                            AppButtonIcon(behavior = behavior,
                                slot = { AppIcon(behavior = AppIconBehavior.INFO)}) {}
                        }
                        items(AppColorBehavior.values()) { behavior ->
                            AppMolIconButton(
                                appColorBehavior = AppColorBehavior.LAODING,
                                appIconBehavior = AppIconBehavior.DISABLED,
                                onClick = {
                                    sequenceOf(
                                        Toast.makeText(
                                            this@MainActivity,
                                            it,
                                            Toast.LENGTH_LONG,
                                        ).show()
                                    )
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

package com.paulo.componentlibray.presentation.design.template

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.paulo.componentlibray.presentation.design.atoms.icons.AppIconBehavior
import com.paulo.componentlibray.presentation.design.atoms.spaces.AppAtomSpaceHeight
import com.paulo.componentlibray.presentation.design.atoms.spaces.AppSizeBehavior
import com.paulo.componentlibray.presentation.design.atoms.text.AppText
import com.paulo.componentlibray.presentation.design.atoms.text.AppTextBehavior
import com.paulo.componentlibray.presentation.design.molecule.AppMolButtonTextIcon
import com.paulo.componentlibray.presentation.design.ui.theme.white

@Composable
fun AppTplForm(
    title: String,
    subtitle: String = "",
    leftOrRight: Boolean = false,
    content: @Composable () -> Unit
) {
    val topEndBottomEnd = if(leftOrRight) 32 else 16
    val topStartBottomStar = if(leftOrRight) 16 else 32

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topEndPercent = 32,
                        bottomEndPercent = 32,
                        topStartPercent = 16,
                        bottomStartPercent = 16
                    )
                ),
            backgroundColor = white,
            content = {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .size(350.dp, 450.dp)
                        .padding(24.dp),
                    content = {
                        AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_16)

                        AppText(label = title, behavior = AppTextBehavior.TITLE)

                        AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_4)

                        AppText(
                            label = subtitle,
                            behavior = AppTextBehavior.INFO
                        )

                        AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_28)

                        content()

                        AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_28)

                        AppMolButtonTextIcon(labelButton = "Log in", behavior = AppIconBehavior.NEXT) {

                        }

                    }
                )

            }
        )
    }


}

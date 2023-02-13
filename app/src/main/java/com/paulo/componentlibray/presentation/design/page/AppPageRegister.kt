package com.paulo.componentlibray.presentation.design.page

import androidx.compose.runtime.Composable
import com.paulo.componentlibray.presentation.design.organism.AppOrgRegister
import com.paulo.componentlibray.presentation.design.template.AppTplForm


@Composable
fun AppPageRegister() {

    AppTplForm(
        title = "Log in",
        subtitle = "to start learing"
    ) {
        AppOrgRegister(
            isErrorEmail = false,
            onValueEmail = {},
            isErrorPassword = false,
            onValueChange ={}
        )
    }
}
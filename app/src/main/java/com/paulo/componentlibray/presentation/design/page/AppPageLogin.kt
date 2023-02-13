package com.paulo.componentlibray.presentation.design.page

import androidx.compose.runtime.Composable
import com.paulo.componentlibray.presentation.design.organism.AppOrgLogin
import com.paulo.componentlibray.presentation.design.template.AppTplForm


@Composable
fun AppPageLogin() {

    AppTplForm(
        title = "Log in",
        subtitle = "to start learing"
    ) {
        AppOrgLogin(
            isErrorEmail = false,
            onValueEmail = {},
            isErrorPassword = false,
            onValuePassword ={}
        ) {

        }
    }
}
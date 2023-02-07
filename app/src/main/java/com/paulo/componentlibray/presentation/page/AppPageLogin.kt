package com.paulo.componentlibray.presentation.page

import androidx.compose.runtime.Composable
import com.paulo.componentlibray.presentation.organism.AppOrgLogin
import com.paulo.componentlibray.presentation.template.AppTplLogin

@Composable
fun AppPageLogin() {

    AppTplLogin(
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
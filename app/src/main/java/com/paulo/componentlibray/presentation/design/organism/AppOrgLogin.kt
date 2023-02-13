package com.paulo.componentlibray.presentation.design.organism

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import com.paulo.componentlibray.presentation.design.atoms.spaces.AppAtomSpaceHeight
import com.paulo.componentlibray.presentation.design.atoms.spaces.AppSizeBehavior
import com.paulo.componentlibray.presentation.design.molecule.AppMolTextButton
import com.paulo.componentlibray.presentation.design.molecule.inputs.AppInputBehavior
import com.paulo.componentlibray.presentation.design.molecule.inputs.AppMolInputEmail
import com.paulo.scriptclass.presentation.molecule.AppMolInputPassword

@Composable
fun AppOrgLogin(
    isErrorEmail: Boolean = false,
    isErrorPassword: Boolean = false,
    onValueEmail: (String) -> Unit,
    onValuePassword: (String) -> Unit,
    onValueForgot: () -> Unit,
) {
    val focusManager = LocalFocusManager.current
    var inputEmail by remember { mutableStateOf("") }
    var inputPassword by remember { mutableStateOf("") }
    val appInputBehavior: AppInputBehavior = AppInputBehavior.REGULAR

    AppMolInputEmail(
        label = "Email",
        value = inputEmail,
        onValueChange = {
            onValueEmail(it)
            inputEmail = it
        },
        imeAction = ImeAction.Next,
        isError = isErrorEmail,
        focusManager = focusManager,
        placeholder = "your  email",
        errorMessage = "Ops! este email é invalido",
        appInputBehavior = appInputBehavior
    )

    AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_24)

    AppMolInputPassword(
        labelPassword = "Password",
        value = inputPassword,
        appInputBehavior = appInputBehavior,
        isErrorPassword = isErrorPassword,
        onValueChange = {
            onValuePassword(it)
            inputPassword = it
        },
        focusManager = focusManager,
        placeholder = "your password"
    )

    AppMolTextButton(label = "Fogot password", onClick = onValueForgot)

}


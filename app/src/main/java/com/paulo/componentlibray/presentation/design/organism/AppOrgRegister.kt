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
import com.paulo.componentlibray.presentation.design.molecule.inputs.AppInputBehavior
import com.paulo.componentlibray.presentation.design.molecule.inputs.AppMolInputEmail
import com.paulo.scriptclass.presentation.molecule.AppMolInputPassword

/**
 *
 * @param valueEmail  value of input email
 * @param labelEmail  label to input email
 * @param labelPassword  label to input password
 * @param labelForgot   label to button  forgot password
 * @param valuePassword  value of input password
 * @param onValueEmail  function to receive value of this input email  change
 * @param onValueChangePassword  function to receive value of this input password change
 * @param onValueForgot  click in button forgot password
 *
 */

@Composable
fun AppOrgRegister(
    isErrorEmail: Boolean = false,
    isErrorPassword: Boolean = false,
    onValueEmail: (String) -> Unit,
    onValueChange: (String) -> Unit
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

    AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_14)

    AppMolInputPassword(
        labelPassword = "Password",
        value = inputPassword,
        appInputBehavior = appInputBehavior,
        isErrorPassword = isErrorPassword,
        onValueChange= {
            onValueChange(it)
            inputPassword = it
        },
        focusManager = focusManager,
        placeholder = "your password"
    )
    AppAtomSpaceHeight(appSizeBehavior = AppSizeBehavior.SIZE_14)

    AppMolInputPassword(
        labelPassword = "Rep. Password",
        value = inputPassword,
        appInputBehavior = appInputBehavior,
        isErrorPassword = isErrorPassword,
        onValueChange = {
            onValueChange(it)
            inputPassword = it
        },
        focusManager = focusManager,
        placeholder = "your password"
    )



}
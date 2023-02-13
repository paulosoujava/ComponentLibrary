package com.paulo.scriptclass.presentation.molecule

import androidx.compose.foundation.text.KeyboardActions

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType



import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.paulo.componentlibray.presentation.design.atoms.icons.AppIcon
import com.paulo.componentlibray.presentation.design.atoms.icons.AppIconBehavior
import com.paulo.componentlibray.presentation.design.atoms.text.AppText
import com.paulo.componentlibray.presentation.design.atoms.text.AppTextBehavior

import com.paulo.componentlibray.presentation.design.molecule.inputs.AppInputBehavior
import com.paulo.componentlibray.presentation.design.molecule.inputs.colors


@Composable
fun AppMolInputPassword(
    labelPassword: String,
    appInputBehavior: AppInputBehavior,
    imeAction: ImeAction = ImeAction.Done,
    value: String,
    placeholder: String,
    isErrorPassword: Boolean,
    focusManager: FocusManager,
    onValueChange: (text: String) -> Unit,
) {

    val showPassword = remember { mutableStateOf(false) }

    AppText(label = labelPassword, behavior =  AppTextBehavior.TITLE)
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        /*   label = {
               AppText(labelText = value, appTextBehavior = AppTextBehavior.info)
           },
        */   placeholder = {
            AppText(label = placeholder, behavior = AppTextBehavior.SUBTITLE)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = imeAction
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) }
        ),
        singleLine = true,
        isError = isErrorPassword,

        visualTransformation = if (showPassword.value) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            if (showPassword.value) {
                AppIcon(behavior = AppIconBehavior.NEXT)
                showPassword.value = true
            } else {
                AppIcon(behavior = AppIconBehavior.NEXT)
                showPassword.value = false
            }
        },
        colors = colors(appInputBehavior = appInputBehavior)
    )

}




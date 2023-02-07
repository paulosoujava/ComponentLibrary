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
import com.paulo.componentlibray.presentation.atoms.buttons.AppButtonIcon
import com.paulo.componentlibray.presentation.atoms.icons.AppIcon
import com.paulo.componentlibray.presentation.atoms.icons.AppIconBehavior
import com.paulo.componentlibray.presentation.atoms.text.AppText
import com.paulo.componentlibray.presentation.atoms.text.AppTextBehavior

import com.paulo.componentlibray.presentation.molecule.inputs.AppInputBehavior
import com.paulo.componentlibray.presentation.molecule.inputs.colors
import com.paulo.componentlibray.presentation.ui.theme.AppColorBehavior
import com.paulo.componentlibray.presentation.ui.theme.black


@Composable
fun AppMolInputPassword(
    labelPassword: String,
    appInputBehavior: AppInputBehavior,
    imeAction: ImeAction = ImeAction.Done,
    value: String,
    placeholder: String,
    isErrorPassword: Boolean,
    focusManager: FocusManager,
    onChangeVisible: Boolean = false,
    onChangeIcon: (Boolean) -> Unit,
    onValueChange: (text: String) -> Unit,
) {



    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            AppText(label = labelPassword, behavior = AppTextBehavior.INFO)
        },
        placeholder = {
            AppText(label = placeholder, behavior = AppTextBehavior.INFO)
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

        visualTransformation = if (onChangeVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            if (onChangeVisible) {
                AppButtonIcon(behavior = AppColorBehavior.TRASPARENT, slot = {
                    AppIcon(behavior = AppIconBehavior.LOCK, color = black)
                }) {
                    onChangeIcon(true)
                }


            } else {
                AppButtonIcon(behavior = AppColorBehavior.TRASPARENT, slot = {
                    AppIcon(behavior = AppIconBehavior.WARNING, color = black)
                }) {
                    onChangeIcon(false)
                }
            }
        },
        colors = colors(appInputBehavior = appInputBehavior)
    )

}



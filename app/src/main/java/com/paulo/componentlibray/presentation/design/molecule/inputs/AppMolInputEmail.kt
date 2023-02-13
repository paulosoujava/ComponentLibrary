package com.paulo.componentlibray.presentation.design.molecule.inputs

import androidx.compose.foundation.text.KeyboardActions

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.paulo.componentlibray.presentation.design.atoms.text.AppText
import com.paulo.componentlibray.presentation.design.atoms.text.AppTextBehavior


@Composable
fun AppMolInputEmail(
    modifier: Modifier = Modifier,
    appInputBehavior: AppInputBehavior,
    focusManager: FocusManager,
    imeAction: ImeAction = ImeAction.Done,
    enabled: Boolean = true,
    maxLines: Int = 1,
    label: String,
    value: String,
    errorMessage: String,
    placeholder: String,
    isError: Boolean = false,
    onValueChange: (String) -> Unit,
) {


    AppText(label = label, behavior = AppTextBehavior.TITLE)
    OutlinedTextField(
        value = value,
        isError = isError,
        onValueChange = onValueChange,
        enabled = enabled,
        maxLines = maxLines,
        /*  label = {
              AppText(labelText = label, appTextBehavior = AppTextBehavior.info)
          },*/
        placeholder = {
            AppText(label = placeholder, behavior = AppTextBehavior.SUBTITLE)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = imeAction
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) }
        ),
        colors = colors(appInputBehavior = appInputBehavior)

    )
    if (isError)
        AppText(
            label = errorMessage,
            behavior = AppTextBehavior.ERROR
        )


}




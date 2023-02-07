package com.paulo.componentlibray.presentation.molecule.inputs

import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable


@Composable
fun colors(appInputBehavior: AppInputBehavior) = TextFieldDefaults.outlinedTextFieldColors(
    focusedBorderColor = appInputBehavior.focusedBorderColor,
    unfocusedBorderColor = appInputBehavior.unfocusedBorderColor,
    textColor = appInputBehavior.textColor,
    cursorColor = appInputBehavior.cursorColor,
)
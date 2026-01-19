package com.example.core.components

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.DrawableResource


@Composable
fun AuthButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    icon: DrawableResource? = null,
    text: String,
    isFilled: Boolean
){
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = TODO(),
        shape = ,
        colors = TODO(),
        elevation = TODO(),
        border = TODO(),
        contentPadding = TODO(),
        interactionSource = TODO(),
        content = TODO()
    )
}
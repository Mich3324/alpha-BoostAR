package com.example.core.components

import androidx.annotation.Size
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import boostar.shared.core.generated.resources.Inter_Medium

import boostar.shared.core.generated.resources.Res
import boostar.shared.core.generated.resources.waltographUI
import org.jetbrains.compose.resources.Font

@Composable
fun InterText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Medium
){
    Text(
        text = text,
        modifier = modifier,
        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}
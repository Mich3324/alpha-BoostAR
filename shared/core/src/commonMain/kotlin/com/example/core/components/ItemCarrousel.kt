package com.example.core.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun ItemCarrousel(nombre: String, fotos: List<String>, navigateTo: () -> Unit){
    HorizontalDivider(thickness = 2.dp)
    Text(
        text = nombre,
        modifier = Modifier.clickable(
            onClick = navigateTo
        ).fillMaxWidth(),
        style = TextStyle(
            textAlign = TextAlign.Left,
            fontSize = 24.sp
        )
    )
    LazyRow() {
        items(fotos){
            Card(modifier = Modifier.padding(6.dp)) {
                ItemProducto(it)
            }
        }
    }
}
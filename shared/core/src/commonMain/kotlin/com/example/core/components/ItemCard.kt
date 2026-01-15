package com.example.core.components

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.unit.dp
import boostar.shared.core.generated.resources.Res
import boostar.shared.core.generated.resources.image_placeholder

import io.kamel.core.Resource
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ItemProducto(URL: String){
    val painter = asyncPainterResource(
        data = URL,
    )

    Card(modifier = Modifier.size(150.dp)) {
        when (val resource = asyncPainterResource("https://www.example.com/image.jpg")) {
            is Resource.Loading -> {
                Text("Loading...")
            }

            is Resource.Success -> {
                val painter: Painter = resource.value
                Image(painter, contentDescription = "Profile")
            }

            is Resource.Failure -> {
                val fallbackPainter = painterResource(Res.drawable.image_placeholder)
                Image(fallbackPainter, contentDescription = "Profile")
            }
        }
    }
}
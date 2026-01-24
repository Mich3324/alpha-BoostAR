package com.example.core.components


import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.core.entities.Product


@Composable
fun ItemProduct(product: Product) {

    Card(modifier = Modifier.size(150.dp)) {

        //Image
        AsyncImage(
            model = product.multimedia.filter { m -> m.isPrincipal },
            contentDescription = product.name
        )
    }
}
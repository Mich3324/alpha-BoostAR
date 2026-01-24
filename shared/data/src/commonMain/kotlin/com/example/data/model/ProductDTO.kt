package com.example.data.model

import com.example.core.entities.Multimedia
import com.example.core.entities.Product
import com.example.core.entities.Color
 class ProductDTO(
    val id : Int,
    val name: String,
    val price: Double,
    val discountPrice: Double? = null,
    val brand: String,
    val numLikes: Int,
    val modelURL: String,
    val multimedia: List<Multimedia>
) {
    fun toEntity(): Product{
        return Product(
            id = id,
            name = name,
            price = price,
            discountPrice = discountPrice,
            brand = brand,
            numLikes = numLikes,
            modelURL = modelURL,
            multimedia = multimedia,
            tallas = listOf("S", "M", "L"),
            colors = listOf(Color(0), Color(1))
        )
    }
}

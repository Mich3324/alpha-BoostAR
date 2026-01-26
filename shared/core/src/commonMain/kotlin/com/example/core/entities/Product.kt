package com.example.core.entities

data class Product(
    val id : Int,
    val name: String,
    val price: Double,
    val discountPrice: Double?,
    val brand: Brand,
    val style: Style,
    val numLikes: Int,
    val multimedia: List<Multimedia>,
    val tallas: List<ClothingSize>,
    val colors: List<ProductColor>,
)
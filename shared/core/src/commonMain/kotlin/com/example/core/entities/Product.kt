package com.example.core.entities

data class Product(
    val id : Int,
    val name: String,
    val price: Double,
    val discountPrice: Double?,
    val brand: String,
    val numLikes: Int,
    val modelURL: String,
    val multimedia: List<Multimedia>,
    val tallas: List<String>,
    val colors: List<String>,
)
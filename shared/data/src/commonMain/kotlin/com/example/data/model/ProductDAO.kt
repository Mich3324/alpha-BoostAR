package com.example.data.model

import com.example.core.entities.Brand
import com.example.core.entities.ClothingSize
import com.example.core.entities.Multimedia
import com.example.core.entities.Product
import com.example.core.entities.ProductColor
import com.example.core.entities.Style

class ProductDAO(
    val id : Int,
    val name: String,
    val price: Double,
    val discountPrice: Double? = null,
    val brandId: Int,
    val styleId: Int,
    val timesBougth: Int,
    val numLikes: Int,

) {
    fun toEntity(brand: Brand, style: Style, multimediaList: List<Multimedia>, clothingSizeList: List<ClothingSize>, productColorList: List<ProductColor>): Product{
        return Product(
            id = id,
            name = name,
            price = price,
            discountPrice = discountPrice,
            brand = brand,
            style = style,
            numLikes = numLikes,
            multimedia = multimediaList,
            tallas = clothingSizeList,
            colors = productColorList,
            modelURL = ""
        )
    }
}

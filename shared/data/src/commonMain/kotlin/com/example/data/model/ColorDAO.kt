package com.example.data.model

import androidx.compose.ui.graphics.Color
import com.example.core.entities.ProductColor
import com.example.core.utils.ColorFormatter

class ColorDAO(
    val id: Int,
    val name: String,
    val hexCode: String
){

    fun toEntity(): ProductColor {
        val rgba = ColorFormatter().parseHexColor(hexCode)
        return ProductColor(
            id = id,
            name = name,
            color = Color(red = rgba.r, green = rgba.g, blue = rgba.b, alpha = rgba.a)
        )
    }
}
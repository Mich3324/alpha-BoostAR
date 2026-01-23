package com.example.core.entities

data class Multimedia(
    val id: Int,
    val multimedia_url: String,
    val tipoMultimedia: TypeMultimedia
)

enum class TypeMultimedia{
    IMAGE, VIDEO, MODEL3D
}
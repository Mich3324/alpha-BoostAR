package com.example.core.entities

data class Multimedia(
    val id: Int,
    val multimediaURL: String,
    val isPrincipal: Boolean,
    val type: TypeMultimedia
)

enum class TypeMultimedia{
    IMAGE, VIDEO, MODEL3D
}
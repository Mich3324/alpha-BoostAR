package com.example.data.model

data class MultimediaDAO(
    val idMultimedia: Int,
    val multimediaURL: String,
    val isPrincipal: Boolean,
    val idType: Int
)

data class TypeMultimediaDAO(
    val id: Int,
    val name: String
)


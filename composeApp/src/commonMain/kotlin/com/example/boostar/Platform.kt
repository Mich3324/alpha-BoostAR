package com.example.boostar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.example.core.repository

import com.example.core.entities.Product


interface ProductRepository {
    fun getProducts(): List<Product>
}
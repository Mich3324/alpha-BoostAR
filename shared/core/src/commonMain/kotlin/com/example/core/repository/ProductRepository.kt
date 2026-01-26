package com.example.core.repository

import com.example.core.entities.Product


interface ProductRepository {
    fun getProducts(): List<Product>
    fun getTrendingProducts(): List<Product>
    fun getNewProducts(): List<Product>
    fun getProductByBrannd(): List<Product>

    fun getProductsByDiscount(): List<Product>

    fun getProductById(productId: Int): Product

    fun getProductByStyle(styleId: Int): Product
}
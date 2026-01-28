package com.example.core.repository

import com.example.core.entities.Product


interface ProductRepository {
    suspend fun getProducts(): List<Product>
    /*
    suspend fun getTrendingProducts(): List<Product>
    suspend fun getNewProducts(): List<Product>
    suspend fun getProductByBrannd(): List<Product>

    suspend fun getProductsByDiscount(): List<Product>

    suspend fun getProductById(productId: Int): Product

    suspend fun getProductByStyle(styleId: Int): Product

     */

}
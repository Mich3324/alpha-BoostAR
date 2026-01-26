package com.example.catalog.useCase


import com.example.core.entities.Product
import com.example.core.repository.ProductRepository
import com.example.core.utils.logDebug

class GetProductsUseCase(private val productRepository: ProductRepository) {
     operator fun invoke(): List<Product>{
        return productRepository.getProducts()
    }
}
package com.example.catalog.useCase

import com.example.data.model.ProductDTO
import com.example.core.repository.ProductRepository

class GetProductsUseCase(private val productRepository: ProductRepository) {
     operator fun invoke(): List<ProductDTO>{
        return productRepository.getProducts()
    }
}
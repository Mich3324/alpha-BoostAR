package com.example.ui.screens.homeScreen

import androidx.lifecycle.ViewModel
import com.example.catalog.CatalogUseCaseManager
import com.example.catalog.useCase.GetProductsUseCase
import com.example.core.entities.Product

class HomeScreenViewModel(private val catalogUseCaseManager: CatalogUseCaseManager): ViewModel() {
    fun getProducts(): List<Product>{
        return catalogUseCaseManager.getProductsUseCase()
    }
}
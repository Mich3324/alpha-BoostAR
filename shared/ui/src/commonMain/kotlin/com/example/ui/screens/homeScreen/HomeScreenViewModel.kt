package com.example.ui.screens.homeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catalog.CatalogUseCaseManager
import com.example.catalog.useCase.GetProductsUseCase
import com.example.core.entities.Product
import com.example.core.utils.logDebug
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeScreenViewModel(private val catalogUseCaseManager: CatalogUseCaseManager): ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products

    fun getProducts(){
        viewModelScope.launch {
            _products.value = catalogUseCaseManager.getProductsUseCase()
            logDebug("HomeScreenViewModel", "getProducts: ${_products.value}")
        }
    }
}
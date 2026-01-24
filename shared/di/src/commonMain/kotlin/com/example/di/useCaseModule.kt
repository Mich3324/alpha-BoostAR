package com.example.di

import com.example.catalog.CatalogUseCaseManager
import com.example.catalog.useCase.GetProductsUseCase
import org.koin.dsl.module

val useCaseModule = module {
    // UseCase
    factory { GetProductsUseCase(get() ) }

    //Managers
    factory { CatalogUseCaseManager(get()) }
}
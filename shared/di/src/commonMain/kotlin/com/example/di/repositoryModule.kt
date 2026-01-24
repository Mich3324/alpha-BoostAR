package com.example.di

import com.example.data.implementation.AuthRepositoryImp
import com.example.data.implementation.ProductRepositoryImp
import com.example.core.repository.AuthRepository
import com.example.core.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImp(get()) }
    single<ProductRepository> { ProductRepositoryImp(get()) }
}
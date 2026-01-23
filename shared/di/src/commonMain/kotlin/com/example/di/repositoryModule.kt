package com.example.di

import com.example.data.implementation.AuthRepositoryImp
import com.example.data.repository.AuthRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImp(get()) }
}
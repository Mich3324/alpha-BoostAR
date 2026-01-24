package com.example.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

fun initKoin(additionalConfiguration: KoinApplication.() -> Unit = {}) {
    startKoin {
        modules(supabaseModule, repositoryModule, useCaseModule, viewModelModule)
        additionalConfiguration()
    }
}
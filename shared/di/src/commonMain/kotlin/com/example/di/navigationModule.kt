package com.example.di


import com.example.ui.navigation.MainNavigationWrapper
import org.koin.dsl.module

val navigationModule = module {
    single { MainNavigationWrapper() }

}
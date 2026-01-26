package com.example.di


import com.example.core.utils.logDebug
import com.example.ui.screens.homeScreen.HomeScreenViewModel
import org.koin.core.module.dsl.viewModel


import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeScreenViewModel(get()) }
    logDebug("INICIAMOS KOIN", "ViewModels")
}
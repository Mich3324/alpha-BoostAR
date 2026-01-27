package com.example.ui.screens.homeScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.core.components.ItemCarrousel
import com.example.core.utils.logDebug
import com.example.ui.navigation.Routes
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit){
    //Variables
    val homeScreenViewModel = koinViewModel<HomeScreenViewModel>()
    logDebug("VIEWModel", "${homeScreenViewModel.products.collectAsState()}")
    val products by homeScreenViewModel.products.collectAsState()

    LaunchedEffect(Unit) {
        homeScreenViewModel.getProducts()
    }

    //UI
    Scaffold (
        content = {
            ItemCarrousel(
                name = "Home",
                products = products,
                navigateTo = { },
                itemClickable = { navigateTo(Routes.FeedScreen(it))}
            )
        }
    )

}
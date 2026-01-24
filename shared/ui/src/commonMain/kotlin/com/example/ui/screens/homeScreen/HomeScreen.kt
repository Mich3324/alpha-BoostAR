package com.example.ui.screens.homeScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.core.components.ItemCarrousel
import com.example.ui.navigation.Routes

@Composable
fun HomeScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit){
    Scaffold (
        content = {
            //ItemCarrousel()
        }
    )

}
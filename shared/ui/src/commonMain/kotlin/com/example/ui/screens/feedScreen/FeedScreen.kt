package com.example.ui.screens.feedScreen

import androidx.compose.runtime.Composable
import com.example.core.utils.logDebug
import com.example.ui.navigation.Routes

@Composable
fun FeedScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit = {}){
    logDebug("PANTALLA Feed", "Pantalla Feed")
}
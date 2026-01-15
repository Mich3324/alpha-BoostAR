package com.example.boostar


import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.example.ui.navigation.MainNavigationWrapper

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainNavigationWrapper()
    }
}
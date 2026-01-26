package com.example.boostar

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.example.ui.navigation.MainNavigationWrapper
import com.example.ui.screens.accountScreen.AccountScreen

@Composable
fun App() {
    MaterialTheme {
        MainNavigationWrapper()
    }
}
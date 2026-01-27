package com.example.ui.navigation


import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    data object AccountScreen: Routes()

    @Serializable
    data object BasketScreen: Routes()

    @Serializable
    data class FeedScreen(val productId: Int): Routes()

    @Serializable
    data object HomeScreen: Routes()

    @Serializable
    data object LogInScreen: Routes()

    @Serializable
    data object OnboardingChooseScreen: Routes()

    @Serializable
    data object OnboardingTextScreen: Routes()

    @Serializable
    data object SignInScreen: Routes()
}
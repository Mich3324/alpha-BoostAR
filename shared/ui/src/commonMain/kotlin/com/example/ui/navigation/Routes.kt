package com.example.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {
    @Serializable
    data object AcccountScreen: Routes()

    @Serializable
    data object BasketScren: Routes()

    @Serializable
    data object FeedScreen: Routes()

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
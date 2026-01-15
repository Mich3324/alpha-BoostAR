package com.example.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import com.example.core.utils.back
import com.example.core.utils.backTo
import com.example.core.utils.navigateTo
import com.example.ui.screens.SignInScreen.SignInScreen
import com.example.ui.screens.accountScreen.AccountScreen
import com.example.ui.screens.basketScreen.BasketScreen
import com.example.ui.screens.feedScreen.FeedScreen
import com.example.ui.screens.homeScreen.HomeScreen
import com.example.ui.screens.logInScreen.LogInScreen
import com.example.ui.screens.onboardingChooseScreen.OnboardingChooseScreen

@Composable
fun MainNavigationWrapper() {
    val backStack = rememberNavBackStack(configuration = SavedStateConfiguration.DEFAULT)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.back() },
        entryProvider = entryProvider {
            entry <Routes.AcccountScreen> {
                AccountScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.BasketScren>{
                BasketScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.FeedScreen>{
                FeedScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.HomeScreen>{
                HomeScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.LogInScreen>{
                LogInScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.OnboardingChooseScreen>{
                OnboardingChooseScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.OnboardingTextScreen>{
                OnboardingChooseScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
            entry <Routes.SignInScreen>{
                SignInScreen(
                    navigateTo = { backStack.navigateTo(it)},
                    back = { backStack.back() },
                    backTo = { backStack.backTo(it) }
                )
            }
        }
    )
}
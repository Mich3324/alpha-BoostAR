package com.example.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui.screens.SignInScreen.SignInScreen
import com.example.ui.screens.accountScreen.AccountScreen
import com.example.ui.screens.basketScreen.BasketScreen
import com.example.ui.screens.feedScreen.FeedScreen
import com.example.ui.screens.homeScreen.HomeScreen
import com.example.ui.screens.logInScreen.LogInScreen
import com.example.ui.screens.onboardingChooseScreen.OnboardingChooseScreen

@Composable
fun MainNavigationWrapper() {
    val navController = rememberNavController()
    //rememberNavBackStack(configuration = SavedStateConfiguration.DEFAULT)

    NavHost(navController, Routes.AccountScreen)  {
            composable<Routes.AccountScreen> {
                AccountScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = {  }
                )
            }
        composable<Routes.BasketScreen>{
                BasketScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.FeedScreen>{
                FeedScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.HomeScreen>{
                HomeScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.LogInScreen>{
                LogInScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.OnboardingChooseScreen>{
                OnboardingChooseScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.OnboardingTextScreen>{
                OnboardingChooseScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        composable<Routes.SignInScreen>{
                SignInScreen(
                    navigateTo = { navController.navigate(it)},
                    back = { navController.popBackStack() },
                    backTo = { }
                )
            }
        }
}
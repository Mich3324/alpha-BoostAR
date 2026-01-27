package com.example.ui.screens.accountScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.core.components.AuthButton
import com.example.ui.navigation.Routes
import org.jetbrains.compose.resources.painterResource
import boostar.shared.ui.generated.resources.Res
import boostar.shared.ui.generated.resources.carrusel_auth_1

@Composable
fun AccountScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit){

    Box(
        Modifier.fillMaxSize()

    ){
        Image(
            painter = painterResource(resource = Res.drawable.carrusel_auth_1),
            contentDescription = "Carrusel imagenes"
            )
        Column {
            Text("")
            Card {
                AuthButton(
                    onClick = { navigateTo(Routes.LogInScreen) },
                    text = "Log in",
                    isFilled = true,
                )
                AuthButton(
                    onClick = { navigateTo(Routes.SignInScreen) },
                    text = "Sign in",
                    isFilled = true,
                )
                AuthButton(
                    onClick = { navigateTo(Routes.HomeScreen) },
                    text = "Enter as guest",
                    isFilled = false,
                )

            }
        }
    }

}
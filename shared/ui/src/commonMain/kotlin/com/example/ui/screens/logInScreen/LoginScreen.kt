package com.example.ui.screens.logInScreen

import androidx.compose.animation.core.AnimationEndReason
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import boostar.shared.ui.generated.resources.Res
import boostar.shared.ui.generated.resources.carrusel_auth_2
import com.example.core.components.AuthButton
import com.example.core.themes.authSecondaryButtonColor
import com.example.ui.navigation.Routes
import org.jetbrains.compose.resources.painterResource

@Composable
fun LogInScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit) {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painterResource(Res.drawable.carrusel_auth_2),
            contentScale = ContentScale.Crop,
            contentDescription = "image",
            modifier = Modifier.fillMaxSize()
        )

        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Text(
                text = "Boost",
                style = MaterialTheme.typography.displayMedium,
                color = authSecondaryButtonColor
            )

            Text(
                text = "Log in in the future",
                style = MaterialTheme.typography.displayMedium,
                color = authSecondaryButtonColor
            )

            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = authSecondaryButtonColor,
                shape = RoundedCornerShape(topStart = 32.dp)
            )
            {
                Column(modifier = Modifier.padding(start = 32.dp,end=32.dp, top = 40.dp, bottom = 50.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp))
                {

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

    }

}
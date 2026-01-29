package com.example.ui.screens.accountScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.components.AuthButton
import com.example.ui.navigation.Routes
import org.jetbrains.compose.resources.painterResource
import boostar.shared.ui.generated.resources.Res
import boostar.shared.ui.generated.resources.carrusel_auth_1
import boostar.shared.ui.generated.resources.carrusel_auth_2
import com.example.core.themes.authSecondaryButtonColor
import io.kamel.image.KamelImage

@Composable
fun AccountScreen(navigateTo: (Routes) -> Unit, back: () -> Unit, backTo: (Routes) -> Unit) {

    Box(
        Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Red).fillMaxSize()
        )


        /*
        Image(
            painter = painterResource(resource = Res.drawable.carrusel_auth_1),
            contentDescription = "Carrusel imagenes"
            )

        Image(
            painter = painterResource(Res.drawable.carrusel_auth_2), // Usando KMP Resources
            contentDescription = null,
            contentScale = ContentScale.Crop, // Esto hace que la imagen llene toda la pantalla recortando lo que sobra
            modifier = Modifier.fillMaxSize()
        )
        */

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 0.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        )
        {
            Column(
                modifier = Modifier.padding(
                    horizontal = 24.dp,
                    vertical = 24.dp
                )
            )
            {
                Text(
                    "BoostAR",
                    color = authSecondaryButtonColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    "Try it first.",
                    color = authSecondaryButtonColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Surface(
                modifier = Modifier.fillMaxWidth().height(295.dp),
                color = authSecondaryButtonColor,
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp)
            )
            {
                Column(
                    modifier = Modifier.fillMaxSize().padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {

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
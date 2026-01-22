package com.example.core.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.example.core.themes.authPrimaryButtonColor
import com.example.core.themes.authSecondaryButtonColor
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun AuthButton(
    onClick: () -> Unit = {},
    icon: DrawableResource? = null,
    text: String,
    isFilled: Boolean
){

    Button(
        onClick = onClick,
        modifier = Modifier,
        content = {
            Row {
                icon?.let {
                    Icon(
                        painter = painterResource(icon),
                        contentDescription = "Icono"
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = text)
            }
        },
        colors = if (isFilled) ButtonColors(
            containerColor = authPrimaryButtonColor,
            contentColor = authSecondaryButtonColor,
            disabledContainerColor = authPrimaryButtonColor,
            disabledContentColor = authSecondaryButtonColor
        ) else ButtonColors(
            containerColor = authSecondaryButtonColor,
            contentColor = authPrimaryButtonColor,
            disabledContainerColor = Color.Blue,
            disabledContentColor = Color.Black
        ),
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp,
            brush = SolidColor(Color.Blue)
        )
    )

}


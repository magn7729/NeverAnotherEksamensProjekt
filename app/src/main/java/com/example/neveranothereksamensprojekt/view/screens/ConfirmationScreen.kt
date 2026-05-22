package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite


// SKAL SLETTES DET ER UDELUKKENDE TIL TEST AF NAVIGATION

@Composable
fun ConfirmationScreen(
    onHomeClick: () -> Unit,
    backgroundColor: Color = PureWhite

) {
    DefaultFlowScreen(
        buttonText = "Tilbage til start",
        onButtonClick = onHomeClick,
        showLogo = true,
        showBackButton = false,
        backgroundColor = backgroundColor
    ) {
        // Column placerer elementerne lodret under hinanden
        Column(
            modifier = Modifier
                // Gør at layoutet fylder hele skærmen
                .fillMaxSize()

                // Giver luft rundt om indholdet
                .padding(24.dp),

            // Centrerer indholdet vandret
            horizontalAlignment = Alignment.CenterHorizontally,

            // Centrerer indholdet lodret
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.confirmationsscreen_model),
                contentDescription = "Model med hvid BH på",
                modifier = Modifier
                    .width(280.dp)
                    .height(340.dp),
                contentScale = ContentScale.Crop // Sikrer at hele billedet vises
            )

            Spacer(modifier = Modifier.height(56.dp))

            // Simpel tekst, så vi kan se hvilken screen vi er på
            Text(
                text = "Din BH er på vej!",
                fontSize = 42.sp,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 20.dp)
            )
        }
    }
}
package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.view.components.BackButton

// SKAL SLETTES DET ER UDELUKKENDE TIL TEST AF NAVIGATION

@Composable
fun CheckoutScreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit

) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){

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
        // Simpel tekst, så vi kan se hvilken screen vi er på
        Text(text = "Checkout screen")

        // Simpel knap, der sender brugeren videre til næste screen
        Button(
            onClick = onNextClick,
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text(text = "Kom i gang")
        }
    }
        BackButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 48.dp)
        )
    }

}
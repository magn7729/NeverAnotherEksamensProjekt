package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel

@Composable
fun ResultScreen(
    viewModel: BraViewModel, // Modtager vores fælles ViewModel som indeholder brugerens indtastede mål
    onNextClick: () -> Unit, // Lambda funktion til navigation til næste screen
    onBackClick: () -> Unit // Lambda funktion til navigation tilbage
) {
    var selectedColor by remember { mutableStateOf("black") } // State som holder styr på den valgte BH farve
                        // remember sørger for at værdien bevares ved recomposition
    DefaultFlowScreen(
        buttonText = "Læg i kurv",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 160.dp, end = 24.dp)
        ) {
            Text(
                text = "Alle mål er angivet i centimeter (cm)",
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 22.sp)
            )
// Viser BH billede baseret på den valgte farve
            Image(
                painter = painterResource(
                    id = if (selectedColor == "black") R.drawable.blackbra else R.drawable.whitebra
                ),
                contentDescription = "BH",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Henter den gemte værdi fra ViewModel
            // ResultScreen fungerer som præsentationslag
            // og viser de data, som tidligere blev indtastet
            Text(text = "Øvre omkreds: ${viewModel.upperCircumference.toInt()} cm",
                color = Color.Black)
            Text(text = "Nedre omkreds: ${viewModel.lowerCircumference.toInt()} cm",
                color = Color.Black)
            Text(text = "Bryst bredde: ${viewModel.breastWidth.toInt()} cm",
                color = Color.Black)
            Text(text = "Bryst højde: ${viewModel.breastHeight.toInt()} cm",
                color = Color.Black)

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Vælg farve", style = MaterialTheme.typography.titleMedium, color = Color.Black)

            Spacer(modifier = Modifier.height(12.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                // Sort farvevalg
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                        .clickable { selectedColor = "black" }
                        .then(
                            if (selectedColor == "black")
                                Modifier.border(3.dp, OrangePrimary, CircleShape)
                            else Modifier
                        )
                )
                // Hvid farvevalg
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .clickable { selectedColor = "white" }
                        .then(
                            if (selectedColor == "white")
                                Modifier.border(3.dp, OrangePrimary, CircleShape)
                            else Modifier
                        )
                )
            }
        }
    }
}
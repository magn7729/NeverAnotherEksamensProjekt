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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel

//Magnus og Mathilde

@Composable
fun ResultScreen(
    viewModel: BraViewModel, // Modtager vores fælles ViewModel som indeholder brugerens indtastede mål
    onNextClick: () -> Unit, // Lambda funktion til navigation til næste screen
    onBackClick: () -> Unit // Lambda funktion til navigation tilbage
) {
    var selectedColor by remember { mutableStateOf("black") } // State som holder styr på den valgte BH farve
                        // remember sørger for at værdien bevares ved recomposition og dermed ikke bliver nulstillet
    DefaultFlowScreen(
        buttonText = "Læg i kurv",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 130.dp, end = 24.dp)
        ) {
            Text(
                text = "Alle dine mål er angivet i centimeter (cm)",
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 19.sp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Image vælges automatisk ud fra selectedColor
            // Når brugeren klikker på en farve, ændres state og Compose opdaterer automatisk billedet
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

            Spacer(modifier = Modifier.height(18.dp))

            // Her sendes data fra ViewModel videre til en seperat composable
            // ResultScreen fungerer som container/præsentationslag mens MeasurementCard håndtere selve visningen af målene.
            MeasurementCard(
                upperCircumference = viewModel.upperCircumference.toInt(),
                lowerCircumference = viewModel.lowerCircumference.toInt(),
                breastWidth = viewModel.breastWidth.toInt(),
                breastHeight = viewModel.breastHeight.toInt()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Vælg farve", style = MaterialTheme.typography.titleMedium, color = Color.Black)

            Spacer(modifier = Modifier.height(12.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                // Sort farvevalg
                // clickable ændrer selectedColor-state
                // Når state ændres, trigger det recomposition
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
                // Samme state-logik som ved sort farve
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
@Composable
private fun MeasurementCard(
    upperCircumference: Int,
    lowerCircumference: Int,
    breastWidth: Int,
    breastHeight: Int
) {
    // MeasurementCard er lavet som en seperat composable, fordi måle-sektionen
    // er en selvstændig UI-del.
    // Det gør ResultScreen lettere at læse og reducerer gentaget kode.

    Column {
        Text(
            text = "Dine mål",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Denne Column er et visuelt card.
        // Den grupperer målene, så de fremstår som en samlet komponent
        // i stedet for fire almindelige Text-elements
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp)) // Bruges til at lave afrundede hjørner
                .background(Color.White.copy(alpha = 0.35f)) // Gør baggrund en smule gennemsigtig
                .border( // Bruges til at fremhæve card
                    width = 1.dp,
                    color = Color.Black.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(18.dp)
                )
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Hver række genbruger samme composable
            // Det gør designet konsistent og nemt at ændre et sted
            MeasurementRow("Øvre omkreds", upperCircumference)
            MeasurementRow("Nedre omkreds", lowerCircumference)
            MeasurementRow("Bryst bredde", breastWidth)
            MeasurementRow("Bryst højde", breastHeight)
        }
    }
}

@Composable
private fun MeasurementRow(
    label: String,
    value: Int
) {
    // MeasurementRow viser en måling.
    // Den tager label og value som parametre, så samme UI kan genbruges
    // til alle fire mål uden at skrive fire forskellige layouts.
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            color = Color.Black.copy(alpha = 0.65f),
            fontSize = 15.sp
        )

        Text(
            text = "$value cm",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}
package com.example.neveranothereksamensprojekt.view.screens

import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton

// Oliver

@Composable
fun Homescreen(
    onNextClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Baggrundsbillede
        Image(
            painter = painterResource(id = R.drawable.homescreen_background),
            contentDescription = null, // Tilgængelighed: angives som null, fordi baggrundsbilledet kun er til pynt
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Logo øverst på skærmen
        Image(
            painter = painterResource(id = R.drawable.logo_homescreen),
            contentDescription = "NeverAnother logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 60.dp)
                .width(400.dp)
                .height(45.dp),
            contentScale = ContentScale.Fit
        )

        /*
    Her er der gjort plads til en tilbageknap senere.
            På HomeScreen skal den sandsynligvis ikke vises,
            fordi det er første side i flowet.
            Når I laver en BackButton-component senere,
            kan den fx placeres sådan her:
            BackButton(
                onClick = onBackClick,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 24.dp, top = 48.dp)
            )
     */

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(
                    start = 28.dp,
                    end = 28.dp,
                    bottom = 72.dp
                ),
            horizontalAlignment = Alignment.Start,

        ) {
            Text(
                text = "Lav din egen BH",
                style = MaterialTheme.typography.titleLarge.copy( //Henter fra ui.theme mappen og justerer manuelt farven efter
                    fontSize = 36.sp,
                    lineHeight = 42.sp
                ),
                color = Color.White
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Bliv guidet gennem en enkel måling hjemmefra, så vi kan skræddersy en BH, der passer præcist til dig",
                style = MaterialTheme.typography.bodyLarge.copy( //Henter fra ui.theme mappen og justerer manuelt farven efter
                    fontSize = 18.sp,
                    lineHeight = 24.sp
                ),
                color = Color.White,
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.height(80.dp))


            EveryClickButton(           // Bruger Button.kt fra components
                text = "Kom i gang",
                onClick = onNextClick,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(200.dp)
                    .height(65.dp)
            )
        }

    }
}
package com.example.neveranothereksamensprojekt.view.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue
import androidx.compose.material3.Checkbox
import com.example.neveranothereksamensprojekt.view.components.BackButton
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton

// Oliver

@Composable
fun CheckoutScreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    var termsAccepted by remember { mutableStateOf(false) } // lytter på ændringer på termsAccepted.

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        //Resten af layoutet

        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 150.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = termsAccepted,
                onCheckedChange = { isChecked ->
                    termsAccepted = isChecked

                }
            )

            Text(
                text = "Jeg accepterer vilkår og betingelser.",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 16.sp
                )
            )


    }
        BackButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 48.dp)
        )

        EveryClickButton(             //Hvis If statement returnerer true kan man klikke på "Køb"
            text = "Køb",
            onClick = {
                if (termsAccepted) {
                    onNextClick()
                }
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 90.dp)
                .width(190.dp)
                .height(56.dp)
        )
    }
}
package com.example.neveranothereksamensprojekt.view.screens

import android.R.attr.width
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite
import com.example.neveranothereksamensprojekt.view.components.BackButton

@Composable
fun Introscreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Hele screenens layout
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BeigeBackground)
                .padding(24.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Logo / Titel
            Text(
                text = "NEVERANOTHER",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(top = 40.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Overskrift
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),
                text = "Før du går i gang",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 30.sp
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Undertekst
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),
                text = "Vi guider dig hele vejen fra målebånd til færdig pasform.",
                style = MaterialTheme.typography.bodyLarge

            )

            Spacer(modifier = Modifier.height(60.dp))

// Boks 1
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )

            ) {
                Row(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = "1",
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Spacer(modifier = Modifier.padding(12.dp))

                    Text(
                        text = "Find et målebånd",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            Spacer(modifier = Modifier.height(60.dp))

// Boks 2
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )

            ) {
                Row(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = "2",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.padding(12.dp))

                    Text(
                        text = "Tag din bedst siddende BH på",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            Spacer(modifier = Modifier.height(60.dp))

// Boks 3
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )

            ) {
                Row(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = "3",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.padding(12.dp))

                    Text(
                        text = "Vi guider dig igennem måleprocessen",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))

            // Vores knap fra vores component "Button.kt"
            EveryClickButton(
                text = "Start måling",
                onClick = onNextClick,

                modifier = Modifier
                    .width(200.dp)
                    .height(65.dp)
            )
        }

        BackButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 48.dp)
        )
    }
}


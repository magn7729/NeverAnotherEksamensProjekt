package com.example.neveranothereksamensprojekt.view.screens

import android.R.attr.width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite
import com.example.neveranothereksamensprojekt.view.components.BackButton
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen

@Composable
fun Introscreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    DefaultFlowScreen(
        buttonText = "Start måling",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 40.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "NEVERANOTHER",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(40.dp))

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

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp),
                text = "Vi guider dig hele vejen fra målebånd til færdig pasform.",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(60.dp))

            // Boks 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.container),
                    contentDescription = "Container 1",
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                )

                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = PureWhite)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Find et målebånd",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Boks 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.container2),
                    contentDescription = "Container 2",
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                )

                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = PureWhite)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Tag din bedst siddende BH på",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Boks 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.container3),
                    contentDescription = "Container 3",
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                )

                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = PureWhite)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Skræddersyet og klar",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
    }
}
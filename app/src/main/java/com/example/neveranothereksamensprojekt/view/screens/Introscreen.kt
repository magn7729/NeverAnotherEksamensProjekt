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
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) { /*
            Image(
                painter = painterResource(id = R.drawable.),
                contentDescription = "Container 1",
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp)
                    .offset(x = (-40).dp, y = 30.dp)
            )
*/
            Spacer(modifier = Modifier.width(0.dp))

            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )
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
            /*
            Image(
                painter = painterResource(id = R.drawable.container2),
                contentDescription = "Container 2",
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp)
                    .offset(x = (-40).dp, y = 30.dp)
            )
*/
            Spacer(modifier = Modifier.width(0.dp))

            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )
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
            /*
            Image(
                painter = painterResource(id = R.drawable.container3),
                contentDescription = "Container 3",
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp)

                    .offset(x = (-10).dp, y = 30.dp)
            )
*/
            Spacer(modifier = Modifier.width(0.dp))

            Card(
                modifier = Modifier
                    .width(500.dp)
                    .height(100.dp),

                shape = RoundedCornerShape(16.dp),

                colors = CardDefaults.cardColors(
                    containerColor = PureWhite
                )
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

        /*
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.container),
                contentDescription = "Container 1",
                modifier = Modifier
                    .width(165.dp)
                    .height(165.dp)

                    .offset(x = (-165).dp)
                    .offset(y = 70.dp)
            )
        }


        // Boks 1
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp)
                .width(100.dp)
                .height(100.dp)

                .offset(y = (-100).dp),

                shape = RoundedCornerShape(16.dp),

            colors = CardDefaults.cardColors(
                containerColor = PureWhite
            )

        ) {
            Row(
                modifier = Modifier.padding(24.dp),

            ) {
                Text(
                    text = "1",
                    style = MaterialTheme.typography.bodyLarge
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

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.container2),
                contentDescription = "Container 2",
                modifier = Modifier
                    .width(165.dp)
                    .height(165.dp)

                    .offset(x = (-165).dp)
                    .offset(y = (-95).dp)
            )
        }

// Boks 2
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp)
                .width(100.dp)
                .height(100.dp)

                .offset(y = (-265).dp),


            shape = RoundedCornerShape(16.dp),

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

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.container3),
                contentDescription = "Container 3",
                modifier = Modifier
                    .width(165.dp)
                    .height(165.dp)

                    .offset(x = (-40).dp)
            )
        }

// Boks 3
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp)
                .width(100.dp)
                .height(100.dp)

                .offset(x = (-60).dp),

            shape = RoundedCornerShape(16.dp),

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

         */

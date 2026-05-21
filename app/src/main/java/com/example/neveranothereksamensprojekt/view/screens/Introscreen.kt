package com.example.neveranothereksamensprojekt.view.screens

import android.R.attr.content
import android.R.attr.width
import android.R.id.content
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground
import com.example.neveranothereksamensprojekt.ui.theme.BeigeHighlight
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
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
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .padding(
                    start = 40.dp,
                    end = 16.dp,
                    top = 170.dp
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.flereflueben),
                    contentDescription = "Flueben",
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )

                Spacer(modifier = Modifier.width(24.dp))

                Text(
                    text = "Før du går i gang",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 30.sp
                    )
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Vi guider dig hele vejen fra målebånd til færdig pasform.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 66.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Boks 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                        .background(
                            color = OrangePrimary,
                            shape = RoundedCornerShape(32.dp)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "1",
                        style = MaterialTheme.typography.bodyLarge,
                        color = PureWhite
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 0.1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = BeigeHighlight)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.maalebaand),
                            contentDescription = "Målebånd",
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Find et målebånd",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp),
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 26.dp)
                    .width(4.dp)
                    .height(60.dp)
                    .background(
                        color = OrangePrimary,
                        shape = RoundedCornerShape(16.dp)
                    )
            )

            Spacer(modifier = Modifier.height(0.dp))




            // Boks 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                        .background(
                            color = OrangePrimary,
                            shape = RoundedCornerShape(32.dp)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "2",
                        style = MaterialTheme.typography.bodyLarge,
                        color = PureWhite
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 0.1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = BeigeHighlight)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.tshirt),
                            contentDescription = "Tshirt",
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Tag din bedstsiddende BH på",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp),
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 26.dp)
                    .width(4.dp)
                    .height(60.dp)
                    .background(
                        color = OrangePrimary,
                        shape = RoundedCornerShape(16.dp)
                    )
            )

            Spacer(modifier = Modifier.height(0.dp))

            Spacer(modifier = Modifier.height(0.dp))



            // Boks 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                        .background(
                            color = OrangePrimary,
                            shape = RoundedCornerShape(32.dp)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "3",
                        style = MaterialTheme.typography.bodyLarge,
                        color = PureWhite
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 0.1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .weight(1f)
                        .height(100.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = BeigeHighlight)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.flueben),
                            contentDescription = "Flueben",
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Vi guider dig igennem måleprocessen",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp),
                        )
                    }
                }
            }
        }
    }
}
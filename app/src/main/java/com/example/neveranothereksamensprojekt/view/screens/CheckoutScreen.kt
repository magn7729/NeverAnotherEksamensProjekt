package com.example.neveranothereksamensprojekt.view.screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen

@Composable
fun CheckoutScreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    // State behøver ikke hoistes, fordi den kun bruges lokalt på CheckoutScreen.
    // Hvis checkboxens værdi senere skal bruges andre steder, kan den flyttes til ViewModel.
    var termsAccepted by remember { mutableStateOf(false) }

    DefaultFlowScreen(
        buttonText = "Køb",
        onButtonClick = onNextClick,
        onBackClick = onBackClick,
        showLogo = true
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 32.dp,
                        end = 32.dp,
                        top = 125.dp,
                        bottom = 210.dp
                    )
            ) {
                Text(
                    text = "Kurv",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 42.sp,
                        lineHeight = 46.sp
                    ),
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(20.dp))

                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )

                Spacer(modifier = Modifier.height(32.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.confirmationsscreen_model),
                        contentDescription = "Model med hvid BH",
                        modifier = Modifier
                            .width(145.dp)
                            .height(190.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Din Bh",
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontSize = 22.sp,
                                lineHeight = 26.sp
                            ),
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "799,00 kr",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 19.sp,
                                lineHeight = 22.sp
                            ),
                            color = Color.Gray
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Hvid",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 20.sp,
                                lineHeight = 24.sp
                            ),
                            color = Color.Black
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.LightGray
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "1",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    fontSize = 18.sp
                                ),
                                color = Color.DarkGray
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = "Remove",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 10.sp
                            ),
                            color = Color.LightGray
                        )
                    }
                }

                Spacer(modifier = Modifier.height(42.dp))

                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )

                Spacer(modifier = Modifier.height(42.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Total",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 34.sp,
                            lineHeight = 38.sp
                        ),
                        color = Color.Black
                    )

                    Text(
                        text = "799,00 DKK",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 32.sp,
                            lineHeight = 36.sp
                        ),
                        color = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 145.dp),
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
                        fontSize = 11.sp,
                        lineHeight = 14.sp
                    ),
                    color = Color.Black
                )
            }
        }
    }
}
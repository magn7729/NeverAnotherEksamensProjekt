package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.navigation.Screen
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton
import com.example.neveranothereksamensprojekt.view.components.BackButton


@Composable
fun ResultScreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    DefaultFlowScreen(
        buttonText = "Læg i kurv",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(
                    start = 64.dp,
                    top = 185.dp,
                    end = 28.dp
                )

        ) {
            Text(
                text = "Resultatside",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 46.sp,
                ),
                color = Color.Black
            )
            Box(
                modifier = Modifier.fillMaxSize()
            ) {

            }

        }
    }
}

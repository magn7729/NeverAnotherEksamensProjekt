package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.neveranothereksamensprojekt.navigation.Screen
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton
import com.example.neveranothereksamensprojekt.view.components.BackButton
import com.example.neveranothereksamensprojekt.view.components.MeasurementSlider
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel


@Composable
fun MeasurementsScreen(
    viewModel: BraViewModel,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    DefaultFlowScreen(
        buttonText = "Fortsæt",
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
                text = "Indtast dine mål",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 36.sp,
                ),
                color = Color.Black
            )

            // Sliders skal tilføjes her




        }

        Column(
            modifier = Modifier.padding(top = 250.dp)
        ) {
// Midlertidig for at tjek om ViewModel virker og at tekst bliver printet
            MeasurementSlider(
                label = "Øvre Omkreds",
                sliderPosition = viewModel.upperCircumference,
                onSliderPositionChange = { newValue ->
                    viewModel.updateUpperCircumference(newValue) // Når brugeren ændre slideren opdateres værdien i ViewModel
                                                                 // Data gemmes derfor og bevares selv når brugeren navigerer videre.

                }
            )

            MeasurementSlider(
                label = "Nedre Omkreds",
                sliderPosition = viewModel.lowerCircumference,
                onSliderPositionChange = { newValue ->
                    viewModel.updateLowerCircumference(newValue) // Når brugeren ændre slideren opdateres værdien i ViewModel
                                                                 // Data gemmes derfor og bevares selv når brugeren navigerer videre.

                }
            )

            MeasurementSlider(
                label = "Bryst højde",
                sliderPosition = viewModel.breastWidth,
                onSliderPositionChange = { newValue ->
                    viewModel.updateBreastWidth(newValue) // Når brugeren ændre slideren opdateres værdien i ViewModel
                                                          // Data gemmes derfor og bevares selv når brugeren navigerer videre.

                }
            )

            MeasurementSlider(
                label = "Nedre Omkreds",
                sliderPosition = viewModel.breastHeight,
                onSliderPositionChange = { newValue ->
                    viewModel.updateBreastHeight(newValue) // Når brugeren ændre slideren opdateres værdien i ViewModel
                                                           // Data gemmes derfor og bevares selv når brugeren navigerer videre.

                }
            )
        }


    }
}


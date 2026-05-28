package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.view.components.MeasurementSlider
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel

// Mathilde og Gustav

@Composable
fun MeasurementsScreen(
    viewModel: BraViewModel,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit,
    onGuideClick: (Int) -> Unit
) {
    DefaultFlowScreen(
        buttonText = "Fortsæt",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 64.dp, top = 185.dp, end = 28.dp)
        ) {
            Text(
                text = "Indtast dine mål",
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 36.sp),
                color = Color.Black
            )
        }

        Column(modifier = Modifier.padding(top = 250.dp)) {

            MeasurementSlider(
                label = "Øvre Omkreds",
                sliderPosition = viewModel.upperCircumference,
                onSliderPositionChange = { newValue ->
                    viewModel.updateUpperCircumference(newValue) // Når brugeren ændrer slideren opdateres værdien i ViewModel
                    // Data gemmes og bevares selv når brugeren navigerer videre
                },
                onGuideClick = { onGuideClick(0) }, // Navigerer til guide for Øvre Omkreds
                valueRange = 77f..113f
            )

            MeasurementSlider(
                label = "Nedre Omkreds",
                sliderPosition = viewModel.lowerCircumference,
                onSliderPositionChange = { newValue ->
                    viewModel.updateLowerCircumference(newValue) // Når brugeren ændrer slideren opdateres værdien i ViewModel
                    // Data gemmes og bevares selv når brugeren navigerer videre
                },
                onGuideClick = { onGuideClick(1) }, // Navigerer til guide for Nedre Omkreds
                valueRange = 65f..100f
            )

            MeasurementSlider(
                label = "Brystvidde",
                sliderPosition = viewModel.breastWidth,
                onSliderPositionChange = { newValue ->
                    viewModel.updateBreastWidth(newValue) // Når brugeren ændrer slideren opdateres værdien i ViewModel
                    // Data gemmes og bevares selv når brugeren navigerer videre
                },
                onGuideClick = { onGuideClick(2) }, // Navigerer til guide for Brystvidde
                valueRange = 0f..50f
            )

            MeasurementSlider(
                label = "Brysthøjde",
                sliderPosition = viewModel.breastHeight,
                onSliderPositionChange = { newValue ->
                    viewModel.updateBreastHeight(newValue) // Når brugeren ændrer slideren opdateres værdien i ViewModel
                    // Data gemmes og bevares selv når brugeren navigerer videre
                },
                onGuideClick = { onGuideClick(3) }, // Navigerer til guide for Brysthøjde
                valueRange = 0f..50f
            )
        }
    }
}
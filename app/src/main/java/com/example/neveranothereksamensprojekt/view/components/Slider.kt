package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.ui.theme.BeigeHighlight
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite
import kotlin.math.roundToInt
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeasurementSlider(
    label: String,
    sliderPosition: Float,
    onSliderPositionChange: (Float) -> Unit

) {

    Column(modifier = Modifier.padding(16.dp)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Mål",
                fontSize = 20.sp
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(PureWhite, RoundedCornerShape(4.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                BasicTextField(
                    value = sliderPosition.roundToInt().toString(),
                    onValueChange = { input ->
                        input.toFloatOrNull()?.let {  newValue ->
                            if (newValue in 0f..200f){
                                onSliderPositionChange(newValue)
                            }

                        }

                        //Det her gør at slideren ændrer sig når man skriver tallet i tekstboxen
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true,
                    textStyle = TextStyle(color = Color.Gray, fontSize = 18.sp),
                    modifier = Modifier.width(48.dp)
                    //Det her gør at man får et keyboardoption frem med tal
                )
                Text(text = "cm", color = OrangePrimary, fontSize = 18.sp)
            }
        }

        Slider(
            value = sliderPosition,
            onValueChange = { onSliderPositionChange (it.roundToInt().toFloat())
                            },
            valueRange = 0f..200f,
            colors = SliderDefaults.colors(
                thumbColor = PureWhite,
                activeTrackColor = OrangePrimary,
                inactiveTrackColor = BeigeHighlight
            ),
            thumb = {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .shadow(4.dp, RoundedCornerShape(15.dp))
                        .background(PureWhite, RoundedCornerShape(4.dp))
                )
            }
        )
    }
}
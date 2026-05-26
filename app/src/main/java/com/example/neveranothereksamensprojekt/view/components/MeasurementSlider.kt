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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite
import kotlin.math.roundToInt
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeasurementSlider(
    label: String,
    sliderPosition: Float,
    onSliderPositionChange: (Float) -> Unit,
    onGuideClick: () -> Unit,
    valueRange: ClosedFloatingPointRange<Float> = 0f..113f
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(bottom = 16.dp)
            .background(color = PureWhite.copy(alpha = 0.45f))
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = label,
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                    color = Color.Black
                )

                Row(verticalAlignment = Alignment.CenterVertically) {

                    BasicTextField(
                        value = sliderPosition.roundToInt().toString(),
                        onValueChange = { input ->
                            input.toFloatOrNull()?.let { newValue ->
                                if (newValue in valueRange) {
                                    onSliderPositionChange(newValue)
                                }
                            }
                            // Det her gør at slideren ændrer sig når man skriver tallet i tekstboxen
                        },

                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        textStyle = TextStyle(color = Color.Gray, fontSize = 15.sp),
                        modifier = Modifier
                            .width(44.dp)
                            .background(PureWhite)
                            .padding(horizontal = 6.dp, vertical = 1.dp)
                        // Det her gør at man får et keyboardoption frem med tal
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = "cm",
                        color = OrangePrimary,
                        fontSize = 15.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(2.dp))

            Slider(
                value = sliderPosition,
                onValueChange = {
                    onSliderPositionChange(it.roundToInt().toFloat())
                },

                valueRange = valueRange,
                colors = SliderDefaults.colors(
                    thumbColor = PureWhite,
                    activeTrackColor = OrangePrimary,
                    inactiveTrackColor = OrangePrimary.copy(alpha = 0.20f)
                ),

                thumb = {
                    Box(
                        modifier = Modifier
                            .size(18.dp)
                            .shadow(3.dp, RoundedCornerShape(12.dp))
                            .background(PureWhite, RoundedCornerShape(4.dp))
                    )
                }
            )
            Row(

                verticalAlignment = Alignment.CenterVertically,

                modifier = Modifier.clickable {

                    onGuideClick()

                }

            ) {

                Text(
                    text = "Se guide her",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 15.sp),
                    color = Color.Gray

                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = ">",
                    fontSize = 22.sp,
                    color = Color.Black
                )

            }
        }
    }
}
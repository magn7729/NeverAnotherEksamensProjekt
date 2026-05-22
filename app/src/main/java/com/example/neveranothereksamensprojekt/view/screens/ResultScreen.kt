package com.example.neveranothereksamensprojekt.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen
import com.example.neveranothereksamensprojekt.view.components.EveryClickButton
import com.example.neveranothereksamensprojekt.view.components.BackButton
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel


@Composable
fun ResultScreen(
    viewModel: BraViewModel,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    var selectedColor by remember { mutableStateOf("black") }

    DefaultFlowScreen(
        buttonText = "Læg i kurv",
        onButtonClick = onNextClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, top = 160.dp, end = 24.dp)
        ) {
            Text(
                text = "Alle mål er angivet i centimeter (cm)",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 22.sp,

            Image(
                painter = painterResource(
                    id = if (selectedColor == "black") R.drawable.blackbra else R.drawable.whitebra
                ),
                contentDescription = "BH",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Vælg farve tekst
            Text(
                text = "Vælg farve",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )

            Text(
                text = "Øvre omkreds: ${viewModel.upperCircumference.toInt()} cm",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )

            Text(
                text = "Nedre omkreds: ${viewModel.lowerCircumference.toInt()} cm",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )

            Text(
                text = "Bryst bredde: ${viewModel.breastWidth.toInt()} cm",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )

            Text(
                text = "Bryst højde: ${viewModel.breastHeight.toInt()} cm",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )

            Box(
                modifier = Modifier.fillMaxSize()
            ) {

            Spacer(modifier = Modifier.height(12.dp))

            // Farveknapper
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                // Sort knap
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                        .clickable { selectedColor = "black" }
                        .then(
                            if (selectedColor == "black")
                                Modifier.border(3.dp, OrangePrimary, CircleShape)
                            else Modifier
                        )
                )

                // Hvid knap
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .clickable { selectedColor = "white" }
                        .then(
                            if (selectedColor == "white")
                                Modifier.border(3.dp, OrangePrimary, CircleShape)
                            else Modifier
                        )
                )
            }
        }
    }
}


}

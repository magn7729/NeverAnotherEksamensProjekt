package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

// Her skal der laves en component til en "tilbage" knap

// Den er lavet - Gustav

@Composable
fun BackButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier

) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(
            text = "←",
            fontSize = 26.sp,
            color = Color.Black
        )
    }
}
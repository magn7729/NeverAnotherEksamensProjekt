package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite


@Composable
fun EveryClickButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = OrangePrimary,
            contentColor = PureWhite
        )
    ) {
        Text(text)
    }
}

@Preview(showBackground = true)
@Composable
fun EveryClickButtonPreview() {
    EveryClickButton(onClick = {}, text = "Click me")
}
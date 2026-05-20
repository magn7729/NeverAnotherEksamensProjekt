package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.ui.theme.PureWhite
import com.example.neveranothereksamensprojekt.ui.theme.BodyFont

@Composable
fun EveryClickButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = OrangePrimary,
            contentColor = PureWhite
        )
    ) {
        Text(
            text = text,
            style = androidx.compose.material3.MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EveryClickButtonPreview() {
    EveryClickButton(
        onClick = {},
        text = "Click her"
    )
}
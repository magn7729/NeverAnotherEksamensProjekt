package com.example.neveranothereksamensprojekt.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.neveranothereksamensprojekt.R

//Mathilde

val BodyFont = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal)
)

val HeadingFont = FontFamily(
    Font(R.font.nohemi_regular, FontWeight.Normal)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = BodyFont,
        fontWeight = FontWeight.Normal,
    ),

    titleLarge = TextStyle(
        fontFamily = HeadingFont,
        fontWeight = FontWeight.Normal,

    ),

)
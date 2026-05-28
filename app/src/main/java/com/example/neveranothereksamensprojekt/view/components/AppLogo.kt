package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.neveranothereksamensprojekt.R

//Gustav

@Composable
fun AppLogo(
    modifier: Modifier = Modifier
) {

    Image(
        painter = painterResource(id = R.drawable.na_logo),
        contentDescription = "Never Another logo",

        modifier = modifier,
        contentScale = ContentScale.Fit // Viser hele billedet uden at beskære det
    )

}
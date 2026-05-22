package com.example.neveranothereksamensprojekt.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground

@Composable
fun DefaultFlowScreen(
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    showLogo: Boolean = true,
    showBackButton: Boolean = true,
    onBackClick: (() -> Unit)? = null, // Hvad betyder det?
    content: @Composable BoxScope.() -> Unit // Hvad betyder det?

) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(BeigeBackground)
    ) {
        content()

        AppLogo(                    //Standardplacering af logo
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 80.dp)
                .width(320.dp)
        )

        if (showBackButton && onBackClick != null) {
            BackButton(
                onClick = onBackClick,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 24.dp, top = 48.dp)
            )
        }


        EveryClickButton(          //Standardplacering af knap i bunden
            text = buttonText,
            onClick = onButtonClick,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 72.dp)
                .width(200.dp)
                .height(65.dp)
        )
    }

}


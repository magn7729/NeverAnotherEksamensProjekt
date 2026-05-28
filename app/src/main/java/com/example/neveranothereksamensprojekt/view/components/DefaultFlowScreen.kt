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
import androidx.compose.ui.graphics.Color
import com.example.neveranothereksamensprojekt.ui.theme.BeigeBackground

// Oliver, Gustav

@Composable
fun DefaultFlowScreen(
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = BeigeBackground,
    showLogo: Boolean = true,
    showBackButton: Boolean = true,
    onBackClick: (() -> Unit)? = null, // Hvad betyder det?
    content: @Composable BoxScope.() -> Unit // Hvad betyder det?

) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        content()

        if (showLogo) { // Standard placering af logo undtagen hvis andet er angivet
            AppLogo(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 80.dp)
                    .width(320.dp)
            )
        }

        if (showBackButton && onBackClick != null) {
            BackButton(
                onClick = onBackClick,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 24.dp, top = 48.dp)
            )
        }


        OrangeDefaultButton(          //Standardplacering af knap i bunden
            text = buttonText,
            onClick = onButtonClick,
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }

}


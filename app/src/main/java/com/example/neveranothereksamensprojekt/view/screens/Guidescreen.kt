package com.example.neveranothereksamensprojekt.view.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.neveranothereksamensprojekt.model.MeasurementGuide
import com.example.neveranothereksamensprojekt.ui.theme.OrangePrimary
import com.example.neveranothereksamensprojekt.ui.theme.BeigeHighlight
import com.example.neveranothereksamensprojekt.view.components.DefaultFlowScreen

@Composable
fun GuideScreen(
    guide: MeasurementGuide,
    onBackClick: () -> Unit
) {
    var selectedTab by remember { mutableStateOf("visuel") }

    DefaultFlowScreen(
        buttonText = "OK",
        onButtonClick = onBackClick,
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp, top = 160.dp)
        ) {
            // Tab knapper
            Row(
                modifier = Modifier
                    .background(Color(0xFFF2EBDB), RoundedCornerShape(8.dp))
                    .padding(4.dp)
            ) {
                TabButton(
                    text = "Visuel",
                    selected = selectedTab == "visuel",
                    onClick = { selectedTab = "visuel" }
                )
                TabButton(
                    text = "Video",
                    selected = selectedTab == "video",
                    onClick = { selectedTab = "video" }
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            if (selectedTab == "visuel") {
                Text(
                    text = guide.title,
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 32.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = guide.description,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 18.sp)

                Spacer(modifier = Modifier.height(24.dp))

                Image(
                    painter = painterResource(id = guide.imageRes),
                    contentDescription = guide.title,
                    modifier = Modifier.fillMaxWidth().height(280.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Tip: ${guide.tip}",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 16.sp)
            } else {
                VideoPlayer(
                    videoRes = guide.videoRes,
                    modifier = Modifier.fillMaxWidth().height(280.dp)
                )
            }
        }
    }
}

@Composable
fun TabButton(text: String, selected: Boolean, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(if (selected) OrangePrimary else BeigeHighlight)
            .clickable { onClick() }
            .padding(horizontal = 68.dp, vertical = 10.dp)
    ) {
        Text(
            text = text,
            color = if (selected) Color.White else Color.Gray
        )
    }
}

@Composable
fun VideoPlayer(videoRes: Int, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri(
                Uri.parse("android.resource://${context.packageName}/$videoRes")
            ))
            prepare()
        }
    }

    DisposableEffect(Unit) {
        onDispose { exoPlayer.release() }
    }

    AndroidView(
        factory = { PlayerView(it).apply { player = exoPlayer } },
        modifier = modifier
    )//Denne composable giver mulighed for at afspille video, hjulpet på vej af claude
}
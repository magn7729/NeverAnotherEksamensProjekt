package com.example.neveranothereksamensprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.neveranothereksamensprojekt.navigation.AppNavHost
import com.example.neveranothereksamensprojekt.ui.theme.NeverAnotherEksamensProjektTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeverAnotherEksamensProjektTheme {
                // Opretter den controller, der styrer navigation
                val navController = rememberNavController()

                // Viser vores NavHost, som bestemmer hvilken screen der skal vises
                AppNavHost(navController = navController)

            }
        }
    }
}


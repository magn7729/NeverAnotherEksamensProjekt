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

//Oliver, Gustav, Mathilde og Magnus

// MainActivity er appens startpunkt
class MainActivity : ComponentActivity() {
    // onCreate bliver kaldt når activity'en bliver oprettet.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeverAnotherEksamensProjektTheme { // Dette bliver vist fordi MainActivity er appens startpunkt.
                                               // Det betyder at alt UI som bliver vist i "NeverAnotherEksamensProjektTheme"
                                               // automatisk får appens design og styling
                                               // Her defineres appens farver, typografi og generelle design.
                                               // Det gør at hele appen får samme visuelle stil når man feks laver Buttons og Text
                                               // Når vi skriver "NeverAnotherEksamensProjektTheme" så bruger appen det theme som er defineret i vores Theme.kt fil inde i ui.theme.

                val navController = rememberNavController() // Opretter den controller, der styrer navigation

                // Viser vores NavHost, som bestemmer hvilken screen der skal vises
                AppNavHost(navController = navController)

            }
        }
    }
}


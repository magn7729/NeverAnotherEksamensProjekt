package com.example.neveranothereksamensprojekt.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.neveranothereksamensprojekt.view.screens.CheckoutScreen
import com.example.neveranothereksamensprojekt.view.screens.ConfirmationScreen
import com.example.neveranothereksamensprojekt.view.screens.GuideScreen
import com.example.neveranothereksamensprojekt.view.screens.Homescreen
import com.example.neveranothereksamensprojekt.view.screens.Introscreen
import com.example.neveranothereksamensprojekt.view.screens.MeasurementsScreen
import com.example.neveranothereksamensprojekt.view.screens.ResultScreen
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel

// AppNavHost styrer navigationen mellem appens forskellige screens
// Den bestemmer hvilke sider der skal findes i appen og hvilken side der skal vises først
@Composable
fun AppNavHost(
    // NavControlleren kommer fra MainActivity
    // Den bruges til at navigere mellem de forskellige screens
    navController: NavHostController

) {
    val braViewModel: BraViewModel = viewModel()

    // NavHost fungerer som en container for alle appens navigation-routes
    // startDestination bestemmer hvilken screen appen starter på --> Home
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        // Denne route viser Homescreen
        // Når der trykkes videre navigeres der til Intro-screen
        composable(Screen.Home.route) {
            Homescreen(
                onNextClick = {
                    navController.navigate(Screen.Intro.route)
                }
            )
        }
        // Denne route viser Introscreen
        // Når brugeren trykker videre, navigeres der til Measurement-screen
        composable(Screen.Intro.route) {
            Introscreen(
                onNextClick = {
                    navController.navigate(Screen.Measurements.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }

            )

        }
        // Denne route viser MeasurementsScreen
        // Når brugeren trykker videre, navigeres der til Result-screen
        // Når brugeren trykker på "se guide her knappen"

        composable(Screen.Measurements.route) {
            MeasurementsScreen(
                viewModel = braViewModel,
                onNextClick = {
                    navController.navigate(Screen.Result.route)
                },
                onBackClick = {
                    navController.popBackStack()
                },
                onGuideClick = { index ->
                    navController.navigate("guide/$index") // Navigerer til guide med det rigtige index
                }
            )
        }
        // Denne route viser ResultScreen
        // Når brugere trykker videre, navigeres der til Checkout-Screen
        // Sender den eksisterende BraViewModel videre til ResultScreen
        // ResultScreen får dermed adgang til de samme data, som tidligere blev indtastet på MeasurementsScreen.
        composable(Screen.Result.route) {
            ResultScreen(
                viewModel = braViewModel,
                onNextClick = {
                    navController.navigate(Screen.Checkout.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        // Denne route viser CheckoutScreen
        // Når brugeren trykker videre, navigeres der til Confirmation-Screen.
        composable(Screen.Checkout.route) {
            CheckoutScreen(
                onNextClick = {
                    navController.navigate(Screen.Confirmation.route)
                },
                onBackClick = {
                    navController.popBackStack()

                }
            )
        }

        composable(Screen.Confirmation.route) {
            ConfirmationScreen(
                onHomeClick = { // Når brugeren trykker på knappen kører den
                    navController.navigate(Screen.Home.route) { // Navigere til home screen
                        popUpTo(Screen.Home.route) { // Rydder stakken af "kort" inkl den forrige hjemmeskærm
                            inclusive = true // Tager også den forrige home screen med
                        }
                    }
                }
            )
        }

        // Denne route viser GuideScreen
        // index bestemmer hvilken guide der vises (0-3)
        composable("guide/{index}") { backStackEntry ->
            val index = backStackEntry.arguments?.getString("index")?.toInt() ?: 0
            val guide = braViewModel.visuelGuides[index]
            GuideScreen(
                guide = guide,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}

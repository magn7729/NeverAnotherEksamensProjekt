package com.example.neveranothereksamensprojekt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.neveranothereksamensprojekt.view.screens.CheckoutScreen
import com.example.neveranothereksamensprojekt.view.screens.ConfirmationScreen
import com.example.neveranothereksamensprojekt.view.screens.Homescreen
import com.example.neveranothereksamensprojekt.view.screens.Introscreen
import com.example.neveranothereksamensprojekt.view.screens.MeasurementsScreen
import com.example.neveranothereksamensprojekt.view.screens.ResultScreen

// AppNavHost styrer navigationen mellem appens forskellige screens
// Den bestemmer hvilke sider der skal findes i appen og hvilken side der skal vises først
@Composable
fun AppNavHost( // NavControlleren kommer fra MainActivity
                // Den bruges til at navigere mellem de forskellige screens
    navController: NavHostController
) {

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
        composable(Screen.Measurements.route) {
            MeasurementsScreen(
                onNextClick = {
                    navController.navigate(Screen.Result.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        // Denne route viser ResultScreen
        // Når brugere trykker videre, navigeres der til Checkout-Screen
        composable(Screen.Result.route) {
            ResultScreen(
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
                onBackClick = {
                    navController.popBackStack()
                }
            )

        }
    }
}

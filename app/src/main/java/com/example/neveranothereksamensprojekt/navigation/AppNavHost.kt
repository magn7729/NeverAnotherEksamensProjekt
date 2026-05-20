package com.example.neveranothereksamensprojekt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.neveranothereksamensprojekt.view.screens.CheckoutScreen
import com.example.neveranothereksamensprojekt.view.screens.Homescreen
import com.example.neveranothereksamensprojekt.view.screens.Introscreen
import com.example.neveranothereksamensprojekt.view.screens.MeasurementsScreen
import com.example.neveranothereksamensprojekt.view.screens.ResultScreen


@Composable
fun AppNavHost(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            Homescreen(
                onNextClick = {
                    navController.navigate(Screen.Intro.route)
                }
            )
        }

        composable(Screen.Intro.route) {
            Introscreen(
                onNextClick = {
                    navController.navigate(Screen.Measurements.route)
                }
            )
        }

        composable(Screen.Measurements.route) {
            MeasurementsScreen(
                onNextClick = {
                    navController.navigate(Screen.Result.route)
                }
            )
        }

        composable(Screen.Result.route) {
            ResultScreen(
                onNextClick = {
                    navController.navigate(Screen.Checkout.route)
                }
            )
        }

        composable(Screen.Checkout.route) {
            CheckoutScreen(
                onNextClick = {
                    navController.navigate(Screen.Confirmation.route)
                }
            )
        }

    }
}
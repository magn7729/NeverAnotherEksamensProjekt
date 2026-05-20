package com.example.neveranothereksamensprojekt.navigation

sealed class Screen (val route: String){ // Hvad betyder sealed?

    // Første side
    data object Home : Screen("home")

    // Intro-side
    data object Intro : Screen("intro")

    // Indtast dine mål side
    data object Measurements : Screen("measurements")

    // Resultat side
    data object Result : Screen("result")

    // Kurv
    data object Checkout : Screen("checkout")

    // Bekræftelse af ordre side
    data object Confirmation : Screen("confirmation")
}

package com.example.neveranothereksamensprojekt.navigation

//Oliver

// Screen.kt bruges til at samle alle appens navigationsruter ét sted
// En route er navnet på den side, som NavHost kan navigere til
// Det gør vi for at undgå, at skrive "home", "intro" osv. manuelt rundt omkring i appen

sealed class Screen (val route: String){ // Screen er en sealed class, som vi bruger til at definere alle de skærme, appen kan navigere til
                                         // Screen er en sealed class med en primary constructor, der kræver en route af datatypen String

    // Vi opretter Home som et data object, der arver fra Screen.
    // Vi sender "home" ind som route, så Screen.Home.route returnerer "home".
    // I AppNavHost matcher vi denne route med Homescreen.
    // Det betyder, at når navigationen går til "home", vises Homescreen.
    data object Home : Screen("home")
    data object Intro : Screen("intro")                         // Samme princip for alle data objekter
    data object Measurements : Screen("measurements")
    data object Result : Screen("result")
    data object Checkout : Screen("checkout")
    data object Confirmation : Screen("confirmation")
}


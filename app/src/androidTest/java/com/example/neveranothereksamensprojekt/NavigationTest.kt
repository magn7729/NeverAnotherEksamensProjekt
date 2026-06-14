package com.example.neveranothereksamensprojekt

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.rememberNavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.neveranothereksamensprojekt.navigation.AppNavHost
import com.example.neveranothereksamensprojekt.ui.theme.NeverAnotherEksamensProjektTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// Gustav

@RunWith(AndroidJUnit4::class)
class NavigationTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun NavigerFraHomescreenTilIntroscreen() {    // Navigere fra homescreen til introscreen og sikrer at der står "Start måling"

        rule.setContent {
            NeverAnotherEksamensProjektTheme {
                val navController = rememberNavController()
                AppNavHost(navController = navController)

            }
        }

        rule.onNodeWithText("Kom igang")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("Start måling")
            .assertExists()
    }
}




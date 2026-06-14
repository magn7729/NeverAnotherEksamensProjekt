package com.example.neveranothereksamensprojekt

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.neveranothereksamensprojekt.view.screens.Homescreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
// Gustav


@RunWith(AndroidJUnit4::class)
class HomeScreenTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun homescreenViserKorrektTitel() {
        rule.setContent {
            Homescreen(
                onNextClick = {}
            )
        }

        rule.onNodeWithText("Lav din egen BH")
            .assertIsDisplayed()
    }
}


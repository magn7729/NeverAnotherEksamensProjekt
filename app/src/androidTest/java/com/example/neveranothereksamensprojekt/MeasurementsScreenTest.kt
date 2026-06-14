package com.example.neveranothereksamensprojekt

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.neveranothereksamensprojekt.view.screens.MeasurementsScreen
import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.performClick

// Gustav

@RunWith(AndroidJUnit4::class)
class MeasurementsScreenTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun measurementScreenViserØvreOmkredsOgGuideKnap() {
        val viewModel = BraViewModel()

        rule.setContent {
            MeasurementsScreen(
                viewModel = viewModel,
                onNextClick = {},
                onBackClick = {},
                onGuideClick = {}
            )
        }

        rule.onNodeWithText("Øvre Omkreds")
            .assertExists()

        rule.onAllNodesWithText("Se guide her")[0]
            .performClick()
    }
}
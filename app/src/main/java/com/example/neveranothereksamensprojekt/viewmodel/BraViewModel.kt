package com.example.neveranothereksamensprojekt.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

//Viewmodel test

// ViewModel holder på appens state og logik.

// Målingerne gemmes her så de kan bruges på tværs af forskellige screens
// MutableFloatStateOf gør værdiernes observerbare for Compose
// Når en værdi ændres, kan UI automatisk opdateres
class BraViewModel : ViewModel() {
    var upperCircumference by mutableFloatStateOf(100f)

    var lowerCircumference by mutableFloatStateOf(100f)

    var breastHeight by mutableFloatStateOf(100f)

    var breastWidth by mutableFloatStateOf(100f)



    // Funktioner der opdaterer hver enkelt slider-state

    fun updateUpperCircumference(value: Float) {
        upperCircumference = value
    }

    fun updateLowerCircumference(value: Float) {
        lowerCircumference = value
    }

    fun updateBreastHeight(value: Float) {
        breastHeight = value
    }

    fun updateBreastWidth(value: Float) {
        breastWidth = value
    }

}
package com.example.neveranothereksamensprojekt.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.neveranothereksamensprojekt.R
import com.example.neveranothereksamensprojekt.model.MeasurementGuide

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

    //Dataen til de forskellige guide screens

    val visuelGuides = listOf(
        MeasurementGuide(
            title = "Øvre omkreds",
            description = "Placér målebåndet rundt om kroppen over brystets fyldigste punkt.",
            imageRes = R.drawable.oevreomkreds,
            tip = "Målebåndet skal ligge tæt, men ikke stramme.",
            videoRes = R.raw.oevreomkredsvideo
        ),
        MeasurementGuide(
            title = "Nedre omkreds",
            description = "Placér målebåndet lige under brystet.",
            imageRes = R.drawable.nedreomkreds,
            tip = "Tjek gerne i et spejl, at målebåndet sidder lige.",
            videoRes = R.raw.nedreomkreds
        ),
        MeasurementGuide(
            title = "Brystvidde",
            description = "Placér målebåndet i en lige, vandret linje over brystets fyldigste punkt.",
            imageRes = R.drawable.brystvidde,
            tip = "Hold målebåndet tæt ind til kroppen uden at stramme.",
            videoRes = R.raw.brystvidde
        ),
        MeasurementGuide(
            title = "Brysthøjde",
            description = "Mål skålens højde i en lodret linje over brystets kurve.",
            imageRes = R.drawable.brysthoejde,
            tip = "Hold målebåndet let ind til brystet, så det følger formen.",
            videoRes = R.raw.brysthoejde
        )
    )

}
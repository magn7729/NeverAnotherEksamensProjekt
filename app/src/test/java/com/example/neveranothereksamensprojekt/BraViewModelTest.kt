package com.example.neveranothereksamensprojekt

import com.example.neveranothereksamensprojekt.viewmodel.BraViewModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class BraViewModelTest {
    @Test
    fun `does updateUpperCircumference update the Value`() {
        val viewModel = BraViewModel()
        viewModel.updateUpperCircumference(70f) // Vi opdaterer værdien
        assertEquals(70f, viewModel.upperCircumference) // tjekker om værdien faktisk bliver opdateret
    }


    @Test
    fun `does updateLowerCircumference update the value`() {
        val viewModel = BraViewModel()
        viewModel.updateLowerCircumference(80f)  // Vi opdaterer værdien
        assertEquals(80f, viewModel.lowerCircumference // tjekker om værdien faktisk bliver opdateret
        )
    }
}





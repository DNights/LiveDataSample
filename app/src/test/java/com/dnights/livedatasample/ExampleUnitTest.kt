package com.dnights.livedatasample

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dnights.livedatasample.viewmodel.NameViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    private lateinit var viewModel: NameViewModel

    @Before
    fun before(){
        viewModel = NameViewModel()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun nameTest(){
        val anotherName = "John Doe"
        viewModel.currentName.value = anotherName

        assertEquals(viewModel.currentName.value , anotherName)
    }
}

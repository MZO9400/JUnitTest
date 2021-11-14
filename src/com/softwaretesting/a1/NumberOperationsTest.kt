package com.softwaretesting.a1

import junit.framework.TestCase.assertEquals
import kotlin.math.sqrt
import org.junit.Test

class NumberOperationsTest {
    private val numberOperations = NumberOperations()
    @Test
    fun add() {
        assertEquals(3, numberOperations.add(1, 2))
    }

    @Test
    fun subtract() {
        assertEquals(1, numberOperations.subtract(3, 2))
    }

    @Test
    fun multiply() {
        assertEquals(6, numberOperations.multiply(2, 3))
    }

    @Test
    fun divide() {
        assertEquals(3, numberOperations.divide(6, 2))
    }

}

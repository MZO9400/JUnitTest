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
    fun addFail() {
        assertEquals(3, numberOperations.add(1, 1))
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

    @Test
    fun isPrime() {
        assertEquals(true, numberOperations.isPrime(5))
        assertEquals(false, numberOperations.isPrime(4))
        assertEquals(true, numberOperations.isPrime(7))
    }

    @Test
    fun distance() {
        assertEquals(sqrt(13.0), numberOperations.distance(3, 8, 5, 11))
    }

}

package com.softwaretesting.a1

import junit.framework.TestCase.assertEquals
import kotlin.math.sqrt
import org.junit.Test


class NumberOperationsFailing {
    private val numberOperations = NumberOperations()
    @Test
    fun isPrime() {
        assertEquals(false, numberOperations.isPrime(2))
    }

    @Test
    fun distance() {
        assertEquals(sqrt(14.0), numberOperations.distance(3, 8, 5, 11))
    }
}

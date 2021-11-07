package com.softwaretesting.a1

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.sqrt

class NumberOperationsTest {
    @org.junit.jupiter.api.Test
    fun add() {
        val numberOperations = NumberOperations()
        assertEquals(3, numberOperations.add(1, 2))
    }

    @org.junit.jupiter.api.Test
    fun subtract() {
        val numberOperations = NumberOperations()
        assertEquals(1, numberOperations.subtract(3, 2))
    }

    @org.junit.jupiter.api.Test
    fun multiply() {
        val numberOperations = NumberOperations()
        assertEquals(6, numberOperations.multiply(2, 3))
    }

    @org.junit.jupiter.api.Test
    fun divide() {
        val numberOperations = NumberOperations()
        assertEquals(3, numberOperations.divide(6, 2))
    }

    @org.junit.jupiter.api.Test
    fun isPrime() {
        val numberOperations = NumberOperations()
        assertEquals(true, numberOperations.isPrime(5))
        assertEquals(false, numberOperations.isPrime(4))
        assertEquals(true, numberOperations.isPrime(7))
    }

    @org.junit.jupiter.api.Test
    fun distance() {
        val numberOperations = NumberOperations()
        assertEquals(sqrt(13.0), numberOperations.distance(3, 8, 5, 11))
    }

}

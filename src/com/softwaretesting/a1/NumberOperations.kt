package com.softwaretesting.a1

import kotlin.math.pow
import kotlin.math.sqrt

class NumberOperations {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun isPrime(a: Int): Boolean {
        if (a == 1) {
            return false
        }
        if (a == 2) {
            return true
        }
        for (i in 2 until a) {
            if (a % i == 0) {
                return false
            }
        }
        return true
    }
    fun distance(x1: Int, y1: Int, x2: Int, y2: Int): Double {
        return sqrt((x2 - x1.toDouble()).pow(2.0) + (y2 - y1.toDouble()).pow(2.0))
    }
}

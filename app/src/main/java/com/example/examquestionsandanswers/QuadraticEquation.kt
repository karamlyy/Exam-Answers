package com.example.examquestionsandanswers

import kotlin.math.sqrt

fun findRootsOfQuadraticEquation(a: Double, b: Double, c: Double) {
    val determinant = b * b - 4 * a * c

    when {
        determinant > 0 -> {
            val root1 = (-b + sqrt(determinant)) / (2 * a)
            val root2 = (-b - sqrt(determinant)) / (2 * a)
            println("The roots are real and different.")
            println("Root 1: $root1")
            println("Root 2: $root2")
        }
        determinant == 0.0 -> {
            val root = -b / (2 * a)
            println("The roots are real and equal.")
            println("Root: $root")
        }
        else -> {
            val realPart = -b / (2 * a)
            val imaginaryPart = sqrt(-determinant) / (2 * a)
            println("The roots are complex and different.")
            println("Root 1: $realPart + ${imaginaryPart}i")
            println("Root 2: $realPart - ${imaginaryPart}i")
        }
    }
}

fun main() {
    println("Enter coefficients of the quadratic equation (a, b, c): ")
    val a = readLine()!!.toDouble() // sample input: 1.0
    val b = readLine()!!.toDouble() // sample input: 5.0
    val c = readLine()!!.toDouble() // sample input -6.0

    if (a == 0.0) {
        println("Invalid input. 'a' coefficient cannot be zero.")
    } else {
        findRootsOfQuadraticEquation(a, b, c)
    }
}



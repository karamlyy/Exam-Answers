package com.example.examquestionsandanswers

import kotlin.math.sqrt

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2 || number == 3) return true
    if (number % 2 == 0 || number % 3 == 0) return false

    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) {
            return false
        }
        i += 6
    }

    return true
}

fun findPrimePairs(num: Int) {
    if (num <= 2) {
        println("$num cannot be expressed as the sum of two prime numbers.")
        return
    }

    for (i in 2..num / 2) {
        if (isPrime(i) && isPrime(num - i)) {
            println("$num = $i + ${num - i}")
        }
    }
}

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toInt() ?: 0
    findPrimePairs(number)
}
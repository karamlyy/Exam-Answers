package com.example.examquestionsandanswers

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun main() {
    println("Enter a year to check if it's a leap year:")
    val inputYear = readLine()?.toIntOrNull()

    if (inputYear != null) {
        val leapYear = isLeapYear(inputYear)
        if (leapYear) {
            println("$inputYear is a leap year.")
        } else {
            println("$inputYear is not a leap year.")
        }
    } else {
        println("Invalid input. Please enter a valid year.")
    }
}

package com.example.examquestionsandanswers.srp

class GradesCalculator {
    fun calculateGrades(marks: Int): String {
        return when (marks) {
            in 90..100 -> "A+"
            in 80..90 -> "A"
            in 70..80 -> "B"
            in 60..70 -> "C"
            in 50..60 -> "D"
            else -> "F"
        }
    }
}

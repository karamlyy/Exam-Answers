package com.example.examquestionsandanswers.srp

fun main() {
    val student = Student("Karam Afandi", 21, 85)

    val gradesCalculator = GradesCalculator()
    val grade = gradesCalculator.calculateGrades(student.marks)

    val studentPrinter = StudentPrinter()
    studentPrinter.printStudentInformation(student, grade)
}

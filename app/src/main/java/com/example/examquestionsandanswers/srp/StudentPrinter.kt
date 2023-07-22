package com.example.examquestionsandanswers.srp

class StudentPrinter {
    fun printStudentInformation(student: Student, grade: String) {
        println("Name: ${student.name}")
        println("Age: ${student.age}")
        println("Marks: ${student.marks}")
        println("Grade: $grade")
    }
}

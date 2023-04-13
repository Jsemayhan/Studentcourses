package ayhansdf100

import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    println("Enter number of new students to enroll")
    val numOfStudents = scanner.nextInt()
    var students = arrayOf<Student>()

    for (i in 0 until numOfStudents) {
        students += Student()
        students[i].enroll()
        students[i].payTuition()
    }

    for (student in students) {
        println(student)
    }
}
package com.amaurypm.kotlintest

import com.amaurypm.kotlintest.model.Student
import com.amaurypm.kotlintest.model.StudentJava

fun main(){
    val a = 3343
    val b:Float = 8.88f
    val c = "hola"
    val d = true

    val e: Int? = null

    val student1 = Student(
        98,
        "Amaury",
        "Perea"
    )

    println("El estudiante 1 es: ${student1.name} ${student1.lastname}")

    val student2 = StudentJava(
        786,
        "Héctor",
        "Matsumura"
    )

    println("El estudiante 2 es: ${student2.name} ${student2.lastname}")

}
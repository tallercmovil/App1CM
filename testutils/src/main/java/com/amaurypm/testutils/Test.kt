package com.amaurypm.testutils

import com.amaurypm.testutils.model.Student

fun main(){

    //String a;
    val a: Short = 4
    val b: Float = 5.86f
    val c = "Hola"
    val d = true

    val e: Int? = null

    val cadena1 = "Amaury"
    var cadena2: String

    cadena2 = "Hola " + cadena1
    cadena2 += " Id: "
    cadena2 += "$a" //Interpolación
    println(cadena2)

    val student1 = Student(8, "Héctor")

    println("Hola ${student1.name}")



}
package com.amaurypm.app1cm

fun main(){
    //int a = 6;
    val a = 1234
    val b: Float = 565.50f
    val c = 9.6
    val d = false

    var cadena1 = "Amaury"
    var cadena2: String

    cadena2 = "Hola " + cadena1
    cadena2 += " Id: "
    cadena2 += "$a"  //Interpolación

    data class Student(
        val id: Int,
        val name: String
    )

    val student1 = Student(2, "Héctor")

    val student2 = Student2(8, "Valeria")


    println(cadena2)
    println("La suma de $a + $b es ${a+b}")
    println("El nombre del estudiante 1 es: ${student1.name}")
    println("El nombre del estudiante 2 es: \"${student2.name}\"")

    var array1 = arrayOf(35, 36, 5, 2) //Así no se no se podrían agregar elementos directamente al final. Se tendrían que dar todos los valores nuevamente.
//no se tiene el método add

    array1 = arrayOf(3345, 36, 5, 80)

    var array2 = arrayOf(true, false)

    val myLambda: (Int) -> Unit = {number ->
        println(number)
    }

    val myLambda2: (Boolean) -> Unit = { flag ->
        println(flag)
    }

    array2.forEach(
        action = myLambda2
    )

}
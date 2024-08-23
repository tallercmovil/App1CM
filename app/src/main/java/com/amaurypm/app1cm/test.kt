package com.amaurypm.app1cm

import kotlin.random.Random

fun main() {
    //println("Hola Amaury")

    var e: String = ""
    var a: Long = 3272348
    val b: Float = 8.6f
    //a = 85
    val c = "Hola"
    val d: Boolean = true

    var cadena = "Hola " + "Amaury"
    cadena += " Núm cuenta: $a"
    var cadena2 = "La suma de $a + $b es ${a + b}"
    var cadena3 = "El \"total\" en el carrito es: \$$b"

    println(cadena)
    println(cadena2)
    println(cadena3)

    var array1 = arrayOf(35, 36, 5, 2)

    array1 = arrayOf(35, 36, 5, 2, 9)

    println(array1.size)

    array1.forEach {
        println(it)
    }

    var lista1 = mutableListOf(35, 36, 5, 2)

    lista1.add(78)
    lista1.add(2, 100)

    println(lista1)

    var lista2 = ArrayList<Int>()

    lista2.add(5)
    lista2.add(6)

    println(lista2)

    var miMapa = mapOf<Float, String>(1.0f to "valor1", 2.0f to "valor2")
    println(miMapa[1.0f])

    val edad = Random.nextInt(1, 100)

    if (edad >= 18) {
        println("Tienes $edad, por lo que eres mayor de edad")
    } else {
        println("Tienes $edad, por lo que eres menor de edad")
    }

    var tipoSaludo = Random.nextInt(1, 200)

    when (tipoSaludo) {
        1 -> {
            println("Hola Amaury")
        }

        2 -> {
            println("¿Qué onda Amaury?")
        }

        else -> {    //Como el default
            println("¿Cómo estás Amaury?")
        }
    }


    var num = 15

    while (num <= 10) {
        println(num)
        num++
    }

    println("------------------------")

    var num2 = 15

    do {
        println(num2)
        num2 += 1
    } while (num2 <= 10)


    /*for(x=1;x<=5;x++){

    }*/
    println("------------------------")
    for (x in 1..5 step 3) {
        println(x)
    }

    var dulcesFavoritos = listOf("Dulce1", "Dulce2", "Dulce3")

    for (dulce in dulcesFavoritos) {
        println(dulce)
    }

    for (num in 1..200) {
        if (num % 2 == 0) println(num)   //Números impares
    }

    fun hola(name: String = "Héctor", surname: String = "Perea") = "Hello $name $surname"

    println(hola(surname = "Matsumura", name = "Amaury")) //llamada

    var alumno1 = Student1(1, "Amaury", "Perea")

    var alumno2 = Student2(1, "Amaury", "Perea")

    println(alumno1.name)

    println(alumno2.name)


    println("------------------------")

    var tipoPersona = Random.nextInt(1, 4)

    var edadpersona: Int? = when (tipoPersona) {
        1 -> 10
        2 -> 20
        else -> null
    }


    edadpersona?.toDouble()
    println(edadpersona)


}
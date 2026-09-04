package com.amaurypm.kotlintest

import com.amaurypm.kotlintest.model.Student
import com.amaurypm.kotlintest.model.StudentJava
import kotlin.random.Random

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

    //scope function apply
    student1.apply {
        name = "Daniel"
        lastname = "Olivares"
    }


    println("El estudiante 1 es: ${student1.name} ${student1.lastname}")

    val student2 = StudentJava(
        786,
        "Héctor",
        "Matsumura"
    )

    println("El estudiante 2 es: ${student2.name} ${student2.lastname}")

    var array1 = arrayOf(35, 36, 5, 2) //Así no se no se podrían agregar elementos directamente al final. Se tendrían que dar todos los valores nuevamente.
//no se tiene el método add

    array1 = arrayOf(56,34,76,8,34)

    println(array1.contentToString()) //Muestra la dirección de memoria del arreglo en lugar de sus elementos.

    fun sumaNumeros(a: Int, b: Int){
        val c = a+b
        println(c)
    }

    val miLambda1: (Int) -> Unit = {
        val z = it*2
        println(z)
    }

    array1.forEach(miLambda1)

    print("\n")
    println(array1[2]) //empieza con el índice cero
    println(array1.size) //cantidad de elementos. En Swift se usa count


    var lista1 = mutableListOf(35,36,5,2)  //Especificando el tipo (opcional)
    lista1.add(6) //agregamos un elemento al final
    lista1.add(2, 80) //se agrega al índice 2 el valor de 80
    println(lista1)

    //Con ArrayLists
    var array2 = ArrayList<String>()

    array2.add("texto1")
    array2.add("texto2")
    array2.add("texto3")

    println(array2)

    var miMapa = mapOf("llave1" to  "valor1", "llave2" to "valor2")
    println(miMapa["llave1"])

    //miMapa["llave3"] = "valor3" //marca error porque no es mutable

    var miMapa2 = mutableMapOf("llave1" to  "valor1", "llave2" to "valor2")
    miMapa2["llave3"] = "valor3"

    println(miMapa2)

    val miMapa3 = mapOf<String,Int>("llave1" to 1, "llave2" to 2)
    println(miMapa3)

    val edad = Random.nextInt(1,100)

    if (edad >= 18) {
        println("Tienes $edad, por lo que eres mayor de edad")
    } else {
        println("Tienes $edad, por lo que eres menor de edad")
    }

    /*print("Ingresa tu edad: ")
    val edad2 = readLine()

    if (!edad2.isNullOrEmpty() && edad2.toIntOrNull() != null) {
        if (edad2.toInt() >= 18) {
            println("Eres mayor de edad")
        } else {
            println("Eres menor de edad")
        }
    }else{
        println("Ingresa una edad válida")
    }*/

    var tipoSaludo = Random.nextInt(1,4)

    when(tipoSaludo){
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

    var num = 1

    while (num<=10){
        println(num)
        num++
    }

    println("------------------------")

    var num2 = 1

    do {
        println(num2)
        num2 += 1
    } while (num2<=10)

    for (x in 1..5){
        println(x)
    }

    for (x in 1..9 step 2){
        println(x)
    }

    for (x in 5 downTo 1){
        println(x)
    }

    for (x in 1.rangeTo(15)) {
        println(x)
    }

    for(x in 1 until 5){

    }

    var dulcesFavoritos = listOf("Dulce1", "Dulce2", "Dulce3")

    for (dulce in dulcesFavoritos){
        println(dulce)
    }

    dulcesFavoritos.forEach{ println(it) }

    for (num in 1..200){
        if(num % 2 != 0) println(num)   //Números impares
    }

    fun hola(){   //Definición
        println("Hola mundo")
    }
    hola() //llamada

    fun hola2() = "Hola mundo 2"

    println(hola2())

    fun hola3(nombre: String)= "Hola $nombre"

    println(hola3("Ayleen"))

    fun hola4(nombre: String = "Amaury"): String {
        return "Hola $nombre"
    }

    println(hola4()) //pondría "Hola Amaury" (no recibió parámetros)



    fun hola5(nombre: String = "Amaury", apellidos: String = "Perea"): String {
        return "Hola $nombre $apellidos"
    }

    println(hola5(apellidos = "Matsumura", nombre ="Héctor"))

    println(student1.getFullName())

    println(student1.getFullNameUppercase())


}
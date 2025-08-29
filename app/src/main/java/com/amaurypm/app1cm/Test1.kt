package com.amaurypm.app1cm

import kotlin.random.Random

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

    var miMapa = mapOf("llave1" to  "valor1", "llave2" to "valor2")
    println(miMapa["llave1"])

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

//    print("Ingresa tu edad: ")
//    val edad2 = readLine()
//
//    if (!edad2.isNullOrEmpty() && edad2.toIntOrNull() != null) {
//        if (edad2.toInt() >= 18) {
//            println("Eres mayor de edad")
//        } else {
//            println("Eres menor de edad")
//        }
//    }else{
//        println("Ingresa una edad válida")
//    }

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

    for (x in 1 .. 5){
        println(x)
    }

    for (x in 1..9 step 2){
        println(x)
    }

    for (x in 5 downTo 1){
        println(x)
    }

    for (x in 5 downTo 1 step 2){
        println(x)
    }

    for (x in 1.rangeTo(15)) {
        println(x)
    }

    for (x in 1 until 5){
        println(x) //no llega al 5
    }

    var dulcesFavoritos = listOf("Dulce1", "Dulce2", "Dulce3")

    for (dulce in dulcesFavoritos){
        println(dulce)
    }

    dulcesFavoritos.forEach{ println(it) }


    for (num in 1..200){
        if(num % 2 == 0) println(num)   //Números pares
    }

    fun hola(){   //Definición
        println("Hola mundo")
    }
    hola() //llamada

    fun hola2() = "Hola mundo 2"

    println(hola2())

    fun hola3(nombre: String) = "Hola $nombre"

    println(hola3("Valeria"))

    fun hola4(nombre: String = "Amaury"): String {
        return "Hola $nombre"
    }

    println(hola4("xdgdxdgs"))

    fun hola5(nombre: String = "Amaury", apellidos: String = "Perea"): String {
        return "Hola $nombre $apellidos"
    }

    println(hola5(apellidos = "Matsumura", nombre = "Héctor")) //pondría "Hola Amaury Matsumura" (recibió el segundo parámetro)


    class Perro {
        var nombre = ""   //Agregando las propiedades
        var edad = 0
    }

    var miPerro = Perro() //Instanciando un objeto

    miPerro.nombre = "Rocky"   //ya tiene en automático los getters y setters
    miPerro.edad = 7

    class Perro2(var nombre: String, var edad: Int)

    var miPerro2 = Perro2("Rocky", 5)

    class Perro3 {
        var name: String
        var age: Int

        init {          //Inicializador
            name = ""
            age = 0
        }
    }
    var miPerro3 = Perro3()

    class Perro4 {
        var nombre_p: String
        var edad_p: Int

        constructor(nombre: String, edad: Int){
            this.nombre_p = nombre   //como en Java
            this.edad_p = edad
        }

        constructor() {
            nombre_p = "Sin nombre"
            edad_p = 0
        }

        fun infoPerro() {                              //funciones en una clase (o métodos)
            println("$nombre_p tiene $edad_p años")
        }
    }
    var miPerro4 = Perro4("Fido", 8)   //cada uno usa un constructor diferente
    var miPerro5 = Perro4()
    miPerro4.infoPerro()
    miPerro5.infoPerro()

    var edadPersona: Int? = Random.nextInt(0,1) //aleatorios del 0 al 2

    edadPersona = when(edadPersona){
        0 -> null //Permite el valor null. Marcaría error si no se hubiera declarado nullable
        1 -> 10
        else -> 20
    }

    if(edadPersona != null) {
        println("Tu edad en 5 años será de ${edadPersona + 5} años")

    }

    val y = edadPersona?.toDouble()

    println("El valor en double es $y")


}
package com.amaurypm.testutils

import com.amaurypm.testutils.model.Student
import com.amaurypm.testutils.model.Student2
import kotlin.random.Random

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

    val student2 = Student2(10, "Amaury")

    println("Hola ${student2.name}")

    var array1 = arrayOf(35, 36, 5, 2) //Así no se no se podrían agregar elementos directamente al final. Se tendrían que dar todos los valores nuevamente.
    //no se tiene el método add

    array1 = arrayOf(4, 8, 45, 67, 89)

    println(array1) //Muestra la dirección de memoria del arreglo en lugar de sus elementos.

    val myLambda: (Int) -> Unit = { a ->
        val b = a*2
        println(b)
    }

    val myLambda2: (Boolean) -> Unit = { flag ->
        println(flag)
    }

    val booleanArray = arrayOf(true, false, true)

    array1.forEach(action = myLambda)

    booleanArray.forEach(action = myLambda2)

    print("\n")
    println(array1[2]) //empieza con el índice cero
    println(array1.size) //cantidad de elementos. En Swift se usa count

    var lista1 = mutableListOf(35,36,5,2)  //Especificando el tipo (opcional)
    lista1.add(6) //agregamos un elemento al final
    lista1.add(element = 80, index = 2) //se agrega al índice 2 el valor de 80
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

    val miMapa3 = mapOf("llave1" to 1, "llave2" to true)
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

    var num = 15

    while (num<=10){
        println(num)
        num++
    }

    println("------------------------")

    var num2 = 15

    do {
        println(num2)
        num2 += 1
    } while (num2<=10)


    /*
En java se tenía:
for(x=1;x<=5;x+=5){

}
*/

    for (x in 1 until 5){
        println(x)
    }

    for (x in 1..9 step 2){
        println(x)
    }

    for (x in 5 downTo 1){
        println(x)
    }

    //CON STEP:

    for (x in 5 downTo 1 step 2){
        println(x)
    }

    for (x in 1.rangeTo(15)) {
        println(x)
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

    fun hola3(nombre: String = "Amaury") =  "Hola $nombre"

    println(hola3("Valeria"))

    println(hola3())

    fun hola5(nombre: String = "Amaury", apellidos: String = "Perea"): String {
        return "Hola $nombre $apellidos"
    }

    println(hola5(apellidos = "Matsumura", nombre = "Héctor")) //pondría "Hola Amaury Matsumura" (recibió el segundo parámetro)

    println(hola5("Héctor", "Perea")) //pondría "Hola Amaury Matsumura" (recibió el segundo parámetro)

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

    var edadPersona: Int? = Random.nextInt(0,3) //aleatorios del 0 al 2

    edadPersona = when(edadPersona){
        0 -> null //Permite el valor null. Marcaría error si no se hubiera declarado nullable
        1 -> 10
        else -> 20
    }

    if(edadPersona != null){
        println("Tu edad en 5 años será de ${edadPersona + 5} años")
    }

    val y = edadPersona?.toDouble()
    println(y)

    fun operaNumeros(num1: Int, num2: Int, operacion: Operaciones) {
        operacion.suma(num1, num2)
        operacion.resta(num1, num2)
    }

    operaNumeros(10, 8, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("La suma de $a + $b es ${a+b}")
        }

        override fun resta(a: Int, b: Int) {
            println("La resta de $a - $b es ${a-b}")
        }

    })

    operaNumeros(10, 8, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("El doble de la suma de $a + $b es ${2*(a+b)}")
        }

        override fun resta(a: Int, b: Int) {
            println("El triple de la resta de $a - $b es ${3*(a-b)}")
        }

    })

}
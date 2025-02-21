package com.amaurypm.myapp1

import kotlin.random.Random


fun main(){
    println("Hola Amaury")

    var a: Int? = 567
    val b: Float = 8.5f
    var c = "Hola a todas y todos"
    val d = true
    val costo = 580

    a = 678
    //a = null

    c += ". ¿Cómo están?" + " Espero que bien"
    val texto = "La suma de $a + $b es ${a+b}"

    val texto2 = "El \"monto\" de su carrito de compras es \$$costo"

    val alumno = Student("Amaury", "Perea")
    val alumno2 = Student2("Héctor", "Matsumura")
    val alumno3 = Student2(lastname = "fddfg", name = "fccfb")

    println("Holaaaaaa ${alumno.name}")
    println("Hola estudiante 2: ${alumno2.name} ${alumno2.lastname}")

    println(c)
    println(texto)
    println(texto2)

    var array1 = arrayOf(35, 36, 5, 2) //Así no se no se podrían agregar elementos directamente al final. Se tendrían que dar todos los valores nuevamente.

    array1[0] = 10
    println(array1) //Muestra la dirección de memoria del arreglo en lugar de sus elementos.

    array1.forEach{ num ->
        println(num)
    }

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

    var miMapa2 = mutableMapOf("llave1" to  "valor1", "llave2" to "valor2")
    miMapa2["llave3"] = "valor3"

    println(miMapa2)

    val miMapa3 = mapOf<String,Int>("llave1" to 1, "llave2" to 2)
    println(miMapa3)

    val edad = Random.nextInt(1,23) //1 al 99

    if (edad >= 18) {
        println("Tienes $edad, por lo que eres mayor de edad")
    } else {
        println("Tienes $edad, por lo que eres menor de edad")
    }


    var tipoSaludo = Random.nextInt(1,4)

    when(tipoSaludo) {
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

    println("------------------------")

    for(x in 1.rangeTo(10)){
        println(x)
    }

    var dulcesFavoritos = listOf("Dulce1", "Dulce2", "Dulce3")

    for (dulce in dulcesFavoritos){
        println(dulce)
    }

    dulcesFavoritos.forEach{ println(it) }

    fun hola(name: String){
        println("Hola $name!!!")
    }

    hola("Amaury")

    fun hola2(name: String) = "Qué onda $name"


    println(hola2("Héctor"))

    fun hola3(name: String = "Héctor", lastname: String = "Matsumura") =
        "Qué tal $name $lastname"

    println(hola3(lastname = "Perea", name = "Amaury"))

    println(hola3())

    class Perro {
        var nombre = ""   //Agregando las propiedades
        var edad = 0
    }

    var miPerro = Perro() //Instanciando un objeto

    miPerro.nombre = "Rocky"   //ya tiene en automático los getters y setters
    miPerro.edad = 7

    class Perro2(private var nombre: String, private var edad: Int)

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

    val tipoPersona = Random.nextInt(0,100) //valores del 0 al 2

    var edadPersona = when(tipoPersona){
        0 -> null
        1 -> 20
        else -> 30
    }

    if(edadPersona != null) {
        println("La edad de la persona es $edadPersona años")

    }

    val y = edadPersona?.toDouble()
    println(y)

}
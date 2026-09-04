package com.amaurypm.kotlintest

import kotlin.random.Random

fun main(){
    class Perro {
        var nombre = ""   //Agregando las propiedades
        var edad = 0
    }

    var miPerro = Perro() //Instanciando un objeto

    miPerro.nombre = "Rocky"   //ya tiene en automático los getters y setters
    miPerro.edad = 7

    data class Perro2(var nombre: String, var edad: Int)

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
        var nombre: String
        var edad: Int

        constructor(nombre: String, edad: Int){
            this.nombre = nombre   //como en Java
            this.edad = edad
        }

        constructor() {
            nombre = "Sin nombre"
            edad = 0
        }

        fun infoPerro() {                              //funciones en una clase (o métodos)
            println("$nombre tiene $edad años")
        }


    }

    val miPerro4 = Perro4("Fido", 8)   //cada uno usa un constructor diferente
    val miPerro5 = Perro4()
    miPerro4.infoPerro()
    miPerro5.infoPerro()

    var edadPersona: Int? = Random.nextInt(0,1000) //aleatorios del 0 al 2

    edadPersona = when(edadPersona){
        0 -> null //Permite el valor null. Marcaría error si no se hubiera declarado nullable
        1 -> 10
        else -> 20
    }

    if(edadPersona != null){
        println(edadPersona.toDouble())
    }

    //con safe access
    println(edadPersona?.toDouble())

    //con not null assertion
    println(edadPersona!!.toDouble())

}
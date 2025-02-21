package com.amaurypm.myapp1

import android.graphics.Path.Op

fun main(){


    fun operaNumeros(num1: Int, num2: Int){
        println("La suma de $num1 + $num2 es ${num1+num2}")
    }

    operaNumeros(34, 76)

    class Prueba: Operaciones{
        override fun suma(num1: Int, num2: Int) {

        }

        override fun resta(num1: Int, num2: Int) {

        }
    }

    fun operaNumeros(num1: Int, num2: Int, operaciones: Operaciones){
        println("Las operaciones con los números $num1 y $num2 son:")
        operaciones.suma(num1, num2)
        operaciones.resta(num1, num2)
    }

    operaNumeros(56, 43, object: Operaciones{
        override fun suma(num1: Int, num2: Int) {
            println("La suma de $num1 + $num2 es ${num1+num2}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("La resta de $num1 - $num2 es ${num1-num2}")
        }
    })

    operaNumeros(56, 43, object: Operaciones{
        override fun suma(num1: Int, num2: Int) {
            println("El doble de la suma de $num1 + $num2 es ${2*(num1+num2)}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("El triple de la resta de $num1 - $num2 es ${3*(num1-num2)}")
        }
    })

    fun operaNumeros(num1: Int, num2: Int, operacion: (Int, Int) -> Unit){
        operacion(num1, num2)
    }

    val miLambdaSuma: (Int, Int) -> Unit = { a, b ->
        println("La suma de $a + $b es ${a+b}")
    }

    operaNumeros(34, 78) { a, b ->
        println("La suma de $a + $b es ${a+b}")
    }

    operaNumeros(34, 78) { a, b ->
        println("La resta de $a - $b es ${a-b}")
    }

    operaNumeros(34, 78) { a, b ->
        println("La multiplicación de $a * $b es ${a*b}")
    }

}

interface Operaciones{
    fun suma(num1: Int, num2: Int)
    fun resta(num1: Int, num2: Int)
}
package com.amaurypm.app1cm

import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.random.Random


fun main() {
    //println("Hola ejemplo 2")

    fun sumaNumeros(a: Int, b: Int) {
        println("La suma de $a + $b es ${a + b}")
    }


    //sumaNumeros(67,31)

    class Prueba : Operaciones {
        override fun suma(num1: Int, num2: Int) {

        }

        override fun resta(num1: Int, num2: Int) {

        }

    }

    fun operaNumeros(a: Int, b: Int, operaciones: Operaciones) {
        operaciones.suma(a, b)
        operaciones.resta(a, b)
    }

    fun operaNumeros(a: Int, b: Int, operacion: (Int, Int) -> Unit) {
        //val c = a*b
        operacion(a, b)
    }

    fun operaNumeros(
        a: Int,
        b: Int,
        lambda1: (String) -> Boolean,
        lambda2: (Double, Boolean) -> Unit
    ) {

    }

    operaNumeros(25, 50,
        { texto ->
            return@operaNumeros true
        }, { miDouble, miBoolean ->

        })

    val miLambdaSuma: (Int, Int) -> Unit =
        { num1, num2 -> println("La suma con lambda de $num1 + $num2 es ${num1 + num2}") }


    operaNumeros(28, 46) { num1, num2 ->
        println("La suma con lambda de $num1 + $num2 es ${num1 + num2}")
    }

    operaNumeros(28, 46) { num1, num2 ->
        println("La multiplicación con lambda de $num1 * $num2 es ${num1 * num2}")
    }

    fun operaNumeroAleatorio(operacion: (Int) -> Unit) {
        val num = Random.nextInt(0, 100)
        operacion(num)
    }

    operaNumeroAleatorio { numAleatorio ->
        val resultado = numAleatorio * numAleatorio
        println("El cuadrado de $numAleatorio es $resultado")
    }

    operaNumeroAleatorio { numAleatorio ->
        val resultado = numAleatorio.toDouble().pow(3.0)
        //println("El cubo de $numAleatorio es ${String.format( "%.2f" ,resultado)}")
        val decimalFormat = DecimalFormat("###,###,###.00")
        println("El cubo de $numAleatorio es \$${decimalFormat.format(resultado)}")
    }

    operaNumeros(78, 25, object : Operaciones {
        override fun suma(num1: Int, num2: Int) {
            println("La suma de $num1 + $num2 es ${num1 + num2}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("La resta de $num1 - $num2 es ${num1 - num2}")
        }
    })

    operaNumeros(78, 25, object : Operaciones {
        override fun suma(num1: Int, num2: Int) {
            println("El doble de la suma de $num1 + $num2 es ${2 * (num1 + num2)}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("El triple de la resta de $num1 - $num2 es ${3 * (num1 - num2)}")
        }

    })

}

interface Operaciones {
    fun suma(num1: Int, num2: Int)
    fun resta(num1: Int, num2: Int)
}


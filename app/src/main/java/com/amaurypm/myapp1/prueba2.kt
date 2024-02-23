package com.amaurypm.myapp1

import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.random.Random

fun main(){
    //println("La suma de 5 + 10 es ${sumaNumeros(5,10)}")

    /*operaNumeros(30, 18, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("La suma de $a + $b es ${a+b}")
        }

        override fun resta(a: Int, b: Int) {
            println("La resta de $a - $b es ${a-b}")
        }

    })

    operaNumeros(20, 7, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("El doble de la suma de $a y $b es ${2*(a+b)}")
        }

        override fun resta(a: Int, b: Int) {
            println("El triple de la resta de $a y $b es ${3*(a-b)}")
        }

    })*/

    val miLambdaSuma: (Int, Int) -> Unit = { num1, num2 -> println("La suma de $num1 + $num2 es ${num1+num2}") }

    val miLambdaResta: (Int, Int) -> Unit = { num1, num2 ->
        println("La resta de $num1 - $num2 es ${num1-num2}")
    }

    operaNumeros(50, 23) { num1, num2 ->
        println("La suma de $num1 + $num2 es ${num1 + num2}")
    }

    operaNumeros(100, 31, miLambdaResta)

    operaNumeros(90, 40){ x, y ->
        println("La división de $x entre $y es: ${x/y}")
    }

    operaNumeroAleatorio { numeroAleatorio ->
        val resultado = numeroAleatorio.toDouble().pow(3.0)
        println("El cubo del número $numeroAleatorio es: ${String.format("%.2f", resultado)}")
    }

    operaNumeroAleatorio { num ->
        val resultado = num.toDouble().pow(2.0)
        val decimalFormat = DecimalFormat("###,###,###.00")
        println("El cuadrado del número $num es: ${decimalFormat.format(resultado)}")
    }

    operaNumeroAleatorio { num ->
        val resultado = num.toDouble().pow(3.0)
        val decimalFormat = DecimalFormat("###,###,###.00")
        println("El total de tu cuenta es \$${decimalFormat.format(resultado)}")
    }

}

fun sumaNumeros(a: Int, b: Int): String{
    val suma = a+b
    return "$suma"
}

interface Operaciones{
    fun suma(a: Int, b: Int)
    fun resta(a: Int, b: Int)
}

class Prueba : Operaciones{
    override fun suma(a: Int, b: Int) {

    }

    override fun resta(a: Int, b: Int) {

    }
}

fun operaNumeros(a: Int, b: Int, operaciones: Operaciones){
    println("El resultado de las operaciones con los números $a y $b son:")
    operaciones.suma(a, b)
    operaciones.resta(a, b)
}

fun operaNumeros(a: Int, b: Int, operacion: (Int, Int) -> Unit){
    println("La operación con lamdba es: ")
    operacion(a,b)
}

fun operaNumeroAleatorio(operacion: (Int) -> Unit){
    val random = Random.nextInt(0,100)
    operacion(random)
}
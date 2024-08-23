package com.amaurypm.app1cm

fun main(){
    //println("Hola ejemplo 2")

    fun sumaNumeros(a: Int, b: Int){
        println("La suma de $a + $b es ${a+b}")
    }

    //sumaNumeros(67,31)

    /*class Prueba: Operaciones{
        override fun suma(num1: Int, num2: Int) {

        }

        override fun resta(num1: Int, num2: Int) {

        }

    }*/

    fun operaNumeros(a: Int, b: Int, operaciones: Operaciones){
        operaciones.suma(a, b)
        operaciones.resta(a, b)
    }

    operaNumeros(78, 25, object: Operaciones{
        override fun suma(num1: Int, num2: Int) {
            println("La suma de $num1 + $num2 es ${num1+num2}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("La resta de $num1 - $num2 es ${num1-num2}")
        }

    })

    operaNumeros(78, 25, object: Operaciones{
        override fun suma(num1: Int, num2: Int) {
            println("El doble de la suma de $num1 + $num2 es ${2*(num1+num2)}")
        }

        override fun resta(num1: Int, num2: Int) {
            println("El triple de la resta de $num1 - $num2 es ${3*(num1-num2)}")
        }

    })

}

interface Operaciones{
    fun suma(num1: Int, num2: Int)
    fun resta(num1: Int, num2: Int)
}


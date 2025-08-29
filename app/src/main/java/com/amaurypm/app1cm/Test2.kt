package com.amaurypm.app1cm

fun main(){
    operaNumeros(10, 25)

    //mandando llamar la función con interfaz
    operaNumeros(25,10, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("La suma de $a + $b es ${a+b}")
        }

        override fun resta(a: Int, b: Int) {
            println("La resta de $a - $b es ${a-b}")
        }
    })

    operaNumeros(25,10, object: Operaciones{
        override fun suma(a: Int, b: Int) {
            println("El doble de la suma de $a + $b es ${2*(a+b)}")
        }

        override fun resta(a: Int, b: Int) {
            println("El triple de la resta de $a - $b es ${3*(a-b)}")
        }
    })

    val miLambdaSuma: (Int, Int) -> Unit = { a, b -> println("La suma de $a + $b es ${a+b}") }

    operaNumeros(45, 78,miLambdaSuma)

    operaNumeros(45, 100) { a, b ->
        println("La suma de $a + $b es ${a + b}")
    }

    operaNumeros(45, 100) { a, b ->
        println("La resta de $a - $b es ${a - b}")
    }

    operaNumeros(
        80,
        40,
        { a, b ->
            
        },
        { name ->

        }
    )


}

fun operaNumeros(num1: Int, num2: Int){
    println("La suma de $num1 + $num2 es ${num1+num2}")
}

fun operaNumeros(num1: Int, num2: Int, operaciones: Operaciones){
    operaciones.suma(num1, num2)
    operaciones.resta(num1, num2)
}

fun operaNumeros(num1: Int, num2: Int, operacion: (Int, Int) -> Unit){
    //val num3 = num1 *2
    operacion(num1, num2)
}

fun operaNumeros(num1: Int, num2: Int, operacion: (Int, Int) -> Unit, lambda2: (String) -> Unit){
    //val num3 = num1 *2
    operacion(num1, num2)
}
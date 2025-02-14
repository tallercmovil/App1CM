package com.amaurypm.myapp1



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


}
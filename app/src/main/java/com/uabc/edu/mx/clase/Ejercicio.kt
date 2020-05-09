package com.uabc.edu.mx.clase

fun main(){

    val Arreglo: IntArray
    Arreglo = IntArray(size = 8)

    var valoracumulado = 0
    var acumuladomayor36 = 0
    var valoresmayores50 = 0

    println("Introduzca por teclado los 8 valores del arreglo, " +
            "luego precione enter despues de cada valor")

    for(i in 100 downTo 1 ){
        var valorMilimetrico= i/10;
    }

    //Range
    for (i in 0..7){
        print("Valor ${i + 1}: ")
        Arreglo[i] = readLine()!!.toInt()
    }

    for (i in 0..7){
        valoracumulado += Arreglo[i]
       // valoracumulado= valoracumulado +Arreglo[i]
        if (Arreglo[i] > 36) acumuladomayor36 += Arreglo[i]
        if (Arreglo[i] > 50) valoresmayores50++
    }

    println("La suma de todos los valores del arreglo es: $valoracumulado")
    println("La suma de los valores del arreglo mayores que 36 es: $acumuladomayor36")
    println("La cantidad de valores del arreglo mayores que 50 es: $valoresmayores50")
}

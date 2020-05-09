package com.uabc.edu.mx.clase

fun main(){

    //IntArray, ByteArray, LongArray...
    val sueldos:IntArray
    sueldos= IntArray(5)

    for (i in 0..4){

        println("Ingrese sueldos:")
        sueldos[i]= readLine()!!.toInt()

    }
    for (i in 0..4){

        println("Sueldos[$i] :"+sueldos[i])

    }

}
package com.uabc.edu.mx.clase



fun main(){

   val arregloAux= IntArray(5)
    cargarDatos(arregloAux)
    imprimirArreglo(arregloAux)

}

fun cargarDatos( arreglo: IntArray){

    for(i in arreglo.indices){
        println("Ingrese dato:")
        arreglo[i]= readLine()!!.toInt()

    }

}
fun imprimirArreglo(arreglo: IntArray){
    //For each
    for(elmento in arreglo)
        println(elmento)
}


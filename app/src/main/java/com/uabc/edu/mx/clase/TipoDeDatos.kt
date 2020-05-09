package com.uabc.edu.mx.clase



fun main(){

    //Son inmutables
    val valor1:Int
    val valor2:Int
    valor1=100
    valor2= 100


    var resultado:Float
    resultado=100.0f+10.04f
    resultado=0.0f
    var total:Double
    total=100.20

    var titulo:String
    titulo="Hola buen dia"

    if(valor1>=0)
    if(valor1<=0)
    if(valor1==0)
    if(valor1!=0)
    if(valor1>0){

       //Si se cumple
    }else{
        //Si no se cumple entra aqui
    }

    for(i in 1 .. 10){
        println("Numero:"+i)
    }
    textoPorDefecto("titulo del texto")
    textoPorDefecto("titulo del texto","&")
    println("Calcular superficie:"+    calcularSuperficie(10))
    multiplos()

}
//Funciones con valor por defecto
fun textoPorDefecto (titulo:String, caracter:String="*") {
    println(titulo)

    for(i in 1..titulo.length){
        println(caracter)
    }

    println()


}
//Funciones con una unica expresion
fun calcularSuperficie (lado:Int) = lado*lado


//Funciones locales
fun multiplos(){

    fun multi(numero:Int,valor:Int)=numero%valor==0

    var m2=0
    var m5=0

    for(i in 1 .. 10){

        println("Ingrese valor:")
        val valor= readLine()!!.toInt()
        if(multi(valor,2))
            m2++
        if(multi(valor,5))
            m5++

    }

    println("Cantidad de mulitplos de 2: $m2")
    println("Cantidad de mulitplos de 5: $m5")

}



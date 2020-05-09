package com.uabc.edu.mx.clase

class Calculadora {

    fun sumar(a:Double,b:Double):Double = a+b
    fun restar(a:Double,b:Double):Double = a-b
    fun multiplicar(a:Double,b:Double):Double = a*b
    fun dividir(a:Double,b:Double):Double = a/b
    fun potencia(a:Double, b:Int):Double{
        var resultado:Double=1.0
        for(i in 1..b){
            resultado *= a
        }
        return  resultado
    }
    //Factorial  A  A-1 hasta que este valga A=1   Ax (A-1)...
    fun factorial(a:Int):Double{

        var result:Double= 1.0
        for (i in a downTo 1){
            result *= i
        }
        return  result
    }

}

fun main() {

    val calculadoraImp:Calculadora= Calculadora()
    //MENU:  SUMAR, RESTAR, DIVIR, MULTI, POTENCIAR, FACTORIAL, PORCENTAJES ( 20% de A)
    //USANDO WHEN
    // a:Double, b:Double
    println("Que opcion quiere (Escriba el nombre):")
    println("1) SUMAR")
    println("2) RESTAR")
    println("3) SALIR")
    var textoEntrada=0
    try {
       textoEntrada = readLine()?.toInt()!!;

    }catch (e:NumberFormatException ){
        println("Solo se aceptan numeros")
    }
    //SOLICITAR NUMERO A y B
   // val a= readLine();
   // val b= readLine();

    when (textoEntrada) {

        1 -> println("Resultado: [" + calculadoraImp.sumar(5.0,6.0)+"]")


    }

    println("Resultado: [" + calculadoraImp.restar(5.0,6.0)+"]")
    println("Resultado: [" + calculadoraImp.multiplicar(5.0,6.0)+"]")
    println("Resultado: [" + calculadoraImp.dividir(5.0,6.0)+"]")
    println("Resultado: [" + calculadoraImp.potencia(5.0,6)+"]")
    println("Resultado: [" + calculadoraImp.factorial(5)+"]")

}
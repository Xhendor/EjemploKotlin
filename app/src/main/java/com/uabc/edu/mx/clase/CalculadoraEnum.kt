package com.uabc.edu.mx.clase
enum class Operador(val tipo:String){
    SUMA("+"),
    RESTA("-")
}
class CalculadoraEnum (val valor1:Int, val valor2:Int,val operacion:Operador) {
    fun calcular(){
        var resultado:Int =0
        when(operacion){

            Operador.RESTA -> resultado= valor1-valor2
            Operador.SUMA -> resultado=valor1+valor2
        }
        println("$valor1  ${operacion.tipo}  $valor2  es igual a $resultado")
    }
}
fun main(){
    val calc=CalculadoraEnum(90,100,Operador.RESTA)
    calc.calcular()
}
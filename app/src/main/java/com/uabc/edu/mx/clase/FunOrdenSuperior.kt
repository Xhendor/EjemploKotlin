package com.uabc.edu.mx.clase

 fun  operar(v1:Int, v2:Int,fn:(Int,Int)->Int):Int{
     return fn(v1,v2)
 }

fun  operar(v1:Int, v2:Int,v3:String,fn:(Int,Int,String)->Int):Int{
    return fn(v1,v2,v3)
}
fun  operar(v1:Int, v2:Int,v3:Int,fn:(Int,Int,Int)->Int):Int{
    return fn(v1,v2,v3)
}
fun sumar(x1:Int, x2:Int)=x1+x2
fun restar(x1:Int, x2:Int)=x1-x2
fun sumarRevenge(x1:Int, x2:Int,x3:Int)=x1+x2+x3
fun sumarRevenge(x1:Int, x2:Int,x3:String)=x1+x2+x3.length


fun main(){

    val resultad= operar(5,6, ::sumar)

    println("5 + 6 es igual $resultad")
    val resultado= operar(5,6, ::restar)

    println("5 - 6 es igual $resultado")

    val resultadin= operar(5,6, 5,::sumarRevenge)

    println("5 + 6 es igual $resultadin")

    val resultadin1= operar(5,6, "Hola",::sumarRevenge)

    println("5 + 6 +Hola es igual $resultadin1")
}

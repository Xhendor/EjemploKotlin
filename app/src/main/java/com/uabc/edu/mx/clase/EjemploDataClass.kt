package com.uabc.edu.mx.clase

data class EjemploDataClass(var codigo:Int, var descripcion:String,var precio:Double)

enum class TipoCafe{
    LATTE,AMERICANO,CORTADO,DESCAFEINADO
}


class Cafe(val tipo:TipoCafe, val valor:Int){
    fun toPrint(){
        println("Cafe: $tipo cuesta $ $valor")
    }
}



    fun main(){

//        val articulo1= EjemploDataClass(9090,"Lechuga",144.0)
//        val articulo2=EjemploDataClass(9091,"Lechuga Romana",154.0)
//        println(articulo1)
//        println(articulo2)

    val cafe=Cafe(TipoCafe.LATTE,55)
        cafe.toPrint()


    }

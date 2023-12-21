package Kotlin.src.main.kotlin

fun uppercaseString(str: String):String{
    return str.uppercase();
}

    fun main(){
        println(uppercaseString("HelLo"))
        println({string: String -> string.uppercase()}("AAaaee") )
        
    }

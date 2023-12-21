package Kotlin.src.main.kotlin

fun main(){
    val d: Int
    val check = true

    if(check){
        d = 1
    }
    else{
        d = 3
    }
    println(d)
    println(if(d==1) true else false)
}
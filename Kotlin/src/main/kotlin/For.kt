package Kotlin.src.main.kotlin

fun main(){
    for(number in 1..5){
        print(number)
    }
    println()

    val cakes = listOf<String>("carrot", "cheese")
    for(cake in cakes){
        println("It is a $cake cake!");
    }
}
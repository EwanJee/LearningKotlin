package Kotlin.src.main.kotlin

fun main(){
    for(number in 1..5 step 2){
        print(number)
    }
    println()
    println()
    for(number in 5 downTo 1){
        print(number)
    }
    println()

    val cakes = listOf<String>("carrot", "cheese")
    for(cake in cakes){
        println("It is a $cake cake!");
    }
}
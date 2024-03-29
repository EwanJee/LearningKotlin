package Kotlin.src.main.kotlin

fun main(){
    val obj = "hello"

    //1
    when(obj){
        "1" -> println("One")
        "hello" -> println("Greeting")
        else -> println("unknown")
    }

    //1
    val result = when(obj){
        "1" -> "One"
        "hello" -> "Greeting"
        else -> "unknown"
    }
    println(result)

    val  temp = 17

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)
}
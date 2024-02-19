package Kotlin.src.main.kotlin.Chapter2

fun main(){
    println(unitFun())
    val u1 : Unit = println(42)
    println(u1)

    val result =
        if(11 < 42){
            val a : Int = 11
            a + 42
        }
        else 42
    println(result)

}
fun unitFun()  = Unit
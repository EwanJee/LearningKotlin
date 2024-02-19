package Kotlin.src.main.kotlin.Chapter2

class Functions {}


fun main(args : Array<String>) {
    println(max(1,2))
}


fun max(a:Int , b: Int): Int {
    return if (a > b) a else b
}
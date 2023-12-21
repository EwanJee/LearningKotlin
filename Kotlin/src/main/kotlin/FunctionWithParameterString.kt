package Kotlin.src.main.kotlin

fun printMessageWithPrefix(message : String, prefix:String){
    println("[$prefix] $message")
}
fun printMessageWithPrefix2(message : String, prefix:String = "Info"){
    println("[$prefix] $message")
    return // return Unit or return is optional
}
fun main(){
    printMessageWithPrefix("hello","log")
    printMessageWithPrefix(prefix = "Log", message = "hello")

    println()
    printMessageWithPrefix2("Hello")
    printMessageWithPrefix2("Hello","Log")
    printMessageWithPrefix2(prefix = "Log", message = "Hello")

}
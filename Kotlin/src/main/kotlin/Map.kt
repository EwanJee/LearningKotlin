package Kotlin.src.main.kotlin

fun main(){
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190)
    println(readOnlyJuiceMenu)
    println("The price of apple juice is : $${readOnlyJuiceMenu["apple"]}")

    val juiceMenu : MutableMap<String,Int> = mutableMapOf("apple" to 100, "orange" to 150)
    println(juiceMenu)
    println("This map has ${juiceMenu.count()} key-value pairs")

    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked.containsKey("orange"))

    juiceMenu.put("coconut",150)
    println(juiceMenu)
    juiceMenu.remove("coconut")
    println(juiceMenu)

    println(juiceMenu.keys)
    println(juiceMenu.values)

    println("apple" in juiceMenu.keys)
    println(100 in juiceMenu.values)
}
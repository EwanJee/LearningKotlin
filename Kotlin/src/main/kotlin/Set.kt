package Kotlin.src.main.kotlin

fun main(){
    val readOnlyFruit = setOf("apple","banana")
    println("This set has ${readOnlyFruit.count()} items")

    val fruit:MutableSet<String> = mutableSetOf("apple","cherry")

    val fruitLocked : Set<String> = fruit
    println("banana" in fruitLocked)

    fruit.add("dragonfruit")
    println(fruit)
    fruit.remove("dragonfruit")
    println(fruit)

}
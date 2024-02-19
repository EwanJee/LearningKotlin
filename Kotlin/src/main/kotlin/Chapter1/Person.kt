package Kotlin.src.main.kotlin.Chapter1

import Kotlin.src.main.kotlin.Chapter2.Rectangle

data class Person(val name : String, val age: Int? = null)

fun main(args : Array<String>){
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29))
    val oldest = persons.maxBy{it.age ?: 0}
    println("The oldest is: $oldest")
    Rectangle(41, 43).isSquare // Importing the function from another package
}

/**
 * The age property is null by default.
 *
 */
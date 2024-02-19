package Kotlin.src.main.kotlin.Chapter2

import java.util.Random

class Person( val name : String?, var isMarried : Boolean?)
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        } // custom getter
}

fun main(args : Array<String>) {
    val person = Person("Bob", true)
    println(person.name) //getter
    println(person.isMarried)
    person.isMarried = false //setter
    println(person.isMarried)
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    val person2 = Person(null, null);
    println(person2.name)
    val random = Random()
    println(random.nextInt(10))
}


package Kotlin.src.main.kotlin

fun main(){
    val readOnlyShapes = listOf<String>("triangle","square","circle")
    println(readOnlyShapes)
    println("The first item in readOnlyShapes is : ${readOnlyShapes[0]}")

    val shapes : MutableList<String> = mutableListOf("triangle","square","circle")
    println(shapes)
    println("The first item in shapes is : ${shapes.first()}")
    println("The last item in shapes is : ${shapes.last()}")
    println("This list has ${shapes.count()} items")

    //to prevent unwanted modifications,
    val shapesLocked : List<String> = shapes
    println("The first item in readOnlyShapes is : ${shapesLocked.first()}")
    println("circle" in shapesLocked)

    shapes.add("pentagon")
    println(shapes)
    shapes.remove("pentagon")
    println(shapes)


}
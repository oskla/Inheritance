package com.larsson.shapes

class Rectangle(
    var sideA: Double,
    var sideB: Double
) : Shape("Rectangle"){

    init {
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimeter()}")
    }

    fun area() = sideA * sideB
    fun perimeter() = (2 * sideA) + (2 * sideB)
}
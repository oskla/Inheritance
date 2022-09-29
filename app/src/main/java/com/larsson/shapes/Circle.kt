package com.larsson.shapes

class Circle(
    private var radius: Double
) : Shape("Circle") {

    init {
        println("Radius of $name is $radius")
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimieter()}")
    }

    fun area() = radius * radius * ImportantNumbers().Pi
    fun perimieter() = 2 * radius * ImportantNumbers().Pi

}
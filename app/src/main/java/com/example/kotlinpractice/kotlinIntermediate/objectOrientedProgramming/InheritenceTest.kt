package com.example.kotlinpractice.kotlinIntermediate.objectOrientedProgramming

fun main(args: Array<String>) {

    //creating an object from car class
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()

    //creating an object from car class
    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 180

    motor.show()
}
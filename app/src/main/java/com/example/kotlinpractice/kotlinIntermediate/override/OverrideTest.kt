package com.example.kotlinpractice.kotlinIntermediate.override

fun main(args: Array<String>) {

    //creating an object from vehicle class
    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    println("-----------------------")
    var  car = Car()

    car.superStart()
    car.superAccelerate()
    car.superStop()

    println("-----------------------")
    car.start()
    car.accelerate(100)
    car.stop()

}
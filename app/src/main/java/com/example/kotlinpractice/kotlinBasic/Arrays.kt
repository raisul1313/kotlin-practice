package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3, 4, 5)
    var cars = arrayOf("Mercedes", "BMW", "Audi")
    var carsAndAge = arrayOf("Mercedes", 5, "BMW", 6, "Audi", 8)


    println("Element of array age = ${age[2]}")
    println("**********************")
    println("Element of array cars = ${cars[0]}")

    //cars[2] = "Ferrari"
    cars.set(2, "Ferrari")
    println("**********************")
    println("Updated Element of array cars = ${cars[2]}")

    println("Size of array of cars = " + cars.size)

    println("**********************")
    println("Element of array = ${carsAndAge[0]}")
    println("Element of array = ${carsAndAge[1]}")
    println("Element of array = ${carsAndAge[2]}")
    println("Element of array = ${carsAndAge[3]}")


}
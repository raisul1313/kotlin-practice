package com.example.kotlinpractice.kotlinIntermediate.objectOrientedProgramming

fun main(args: Array<String>) {

    //creating an object from class
    var myCar = Cars()
    myCar.name = "Farari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2010

    println("My car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My car's name is ${myCar2.name} and its model is ${myCar2.model}")

    //primary constructor
    var myNewCar = MyCars("Farari", 2020)
    println("My car's name is ${myNewCar.name} and model is ${myNewCar.model}")

    //secondary constructor
    var mySecondCar = MySecondCars("Merchedes", 2000)

    mySecondCar.name ="opel"
    //mySecondCar.model = 2020 // only we get get, but not set value 
    println("My car's name is ${mySecondCar.name} and model is ${mySecondCar.model}")
}
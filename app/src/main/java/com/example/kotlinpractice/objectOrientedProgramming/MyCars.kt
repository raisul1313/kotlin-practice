package com.example.kotlinpractice.objectOrientedProgramming


//primary constructor
class MyCars constructor(var name: String, var model: Int) {

    init {
        println("My car's name is $name and model is $model")
    }
}
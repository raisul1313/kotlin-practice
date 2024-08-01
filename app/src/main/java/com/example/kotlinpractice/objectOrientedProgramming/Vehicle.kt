package com.example.kotlinpractice.objectOrientedProgramming

open class Vehicle {
    var type: String? = null
    var model: String? = null
    var maxSpeed: Int? = null

    fun show(){
        println("Type : $type")
        println("model : $model")
        println("Max Speed : $maxSpeed")
    }
}
package com.example.kotlinpractice.kotlinIntermediate.interfaces

class Vehicles : CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicles can stop.")
    }

}
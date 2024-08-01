package com.example.kotlinpractice.interfaces

class Vehicles : CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicles can stop.")
    }

}
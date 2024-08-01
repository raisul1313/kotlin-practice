package com.example.kotlinpractice.kotlinIntermediate.abstractClass

class Car(override var model: Int) : Vehicle() {

    override fun vehicleName(name: String): String {
        return name
    }
}

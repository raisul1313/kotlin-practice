package com.example.kotlinpractice.objectOrientedProgramming

class MySecondCars {
    var name: String? = null
    var model: Int? = null
        private set
                get

    //constructor()
    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}
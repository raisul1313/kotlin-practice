package com.example.kotlinpractice

fun main(args: Array<String>) {
    var mixArray = arrayListOf<Any>("Kotlin", 2, 2.5, true, "Kotlin")
    var mixSetArray = setOf<Any>("Kotlin", 2, 2, true, 2.5, true, "Kotlin")

    println(mixArray.size)
    println(mixArray.last())
    println("***************")
    //Take unique value
    //if any multiple same value take one
    println(mixSetArray.size)
    println(mixSetArray.last())
}
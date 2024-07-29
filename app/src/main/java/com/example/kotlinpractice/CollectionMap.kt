package com.example.kotlinpractice

fun main(args: Array<String>) {

    //immutable
    var age = mapOf<String, Int>("david" to 20, "messi" to 30,)

    println("---------immutable---------")
    println("Age of David: ${age["david"]}")
    println("Age of Messi: ${age.get("messi")}")

    //mutable
    var mutableAge = mutableMapOf<String, Int>("david" to 60, "messi" to 90)

    mutableAge.put("rahim", 10)
    println("---------mutable---------")
    println("Age of David: ${mutableAge["david"]}")
    println("Age of Messi: ${mutableAge["messi"]}")
    println("Age of Rahim: ${mutableAge["rahim"]}")


}
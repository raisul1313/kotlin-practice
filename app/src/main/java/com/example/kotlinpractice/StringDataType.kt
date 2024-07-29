package com.example.kotlinpractice

fun main(args: Array<String>) {

    var a: String = "Hello Kotlin"
    var b: String = "Language"
    var age: Int = 25


    println(a)
    println(a + b)
    println("$a $b")
    println("Your Age is = $age")
    println("*******************")


    var x: String = "Kotlin"
    var i: Int = x.length
    var k: Boolean = x.equals("Java")
    var j: Boolean = x.isEmpty()
    var l:String = "      Android      "

    println("Length of String is = $i")
    println("Is String equal to Java = $k")
    println("Is String Empty = $j")
    println(x.plus(" $b"))
    println("*******************")
    println(x.lowercase())
    println(x.uppercase())
    println("*******************")
    println(x + l)
    println(x + l.trim())
}
package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {

    var x: Byte = 127
    var y: Int = x.toInt()
    var z: Double = y.toDouble()

    println(x)
    println(y)
    println(z)

    var a:Double = 132.32
    var b:Int = a.toInt()
    var c:Byte = b.toByte() //limit is 127 but the input is 132.32

    println(a)
    println(b)
    println(c)


}
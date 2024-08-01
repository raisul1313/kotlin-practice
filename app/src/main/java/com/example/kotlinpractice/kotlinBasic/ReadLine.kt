package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {
    println("What is your name?")
    var name:String = readln()
    println("What is your age?")
    var age:Int = readln()!!.toInt()
    println("You are $name and $age year's old")
}
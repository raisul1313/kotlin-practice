package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {


    println("Please enter a number : ")
    val number: Int = readln().toInt()
    if(number % 2 == 0 ){
        println("$number is even")
    } else {
        println("$number is odd")
    }
}
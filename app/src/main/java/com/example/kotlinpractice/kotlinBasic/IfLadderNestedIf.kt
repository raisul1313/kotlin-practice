package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {
    println("Please enter three number : ")
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()
    val number3: Int = readln().toInt()

    val largestNumber: Int = if (number1 >= number2) {
        if (number1 >= number3) {
            number1
        } else {
            number3
        }
    } else {
        if (number2 >= number3) {
            number2
        } else {
            number3
        }
    }
    println("The Largest Number is : $largestNumber")
}
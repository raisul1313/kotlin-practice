package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {

    print("Please enter a day number of week : ")
    val dayNumber: Int = readln().toInt()

    val day: String = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }

    println("Day is $day")

}
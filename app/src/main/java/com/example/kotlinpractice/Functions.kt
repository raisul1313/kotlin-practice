package com.example.kotlinpractice

fun main(args: Array<String>) {

    print("Enter the first Number : ")
    var number1: Int = readln().toInt()

    print("Enter the second Number : ")
    var number2: Int = readln().toInt()

    show(number1, number2)

    var a = add(number1, number2)
    println("Sum of the two number = $a")

    var b = findMinimumNumber(number1, number2)
    println("The minimum number is $b")

}

fun show(num1: Int, num2: Int) {
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int {
    var sum: Int = 0
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1: Int, num2: Int): Int {
    var minimum: Int = if (num1 > num2) {
        num2
    } else {
        num1
    }
    return minimum
}
package com.example.kotlinpractice

import kotlin.random.Random

fun main(args: Array<String>) {
    /*var i: Int = 5
    while (i > 0){
       println(i)
        i--
    }*/

    // 3 --> 3*2*1 --> 5*4*3*2*1
    /*  var k: Int = 1
      var fact: Int = 1
      while (k < 6) {
          fact *= k // fact = fact * k
          println("$k! = $fact")
          k++
      }*/

    //infinite loop
    val number = Random.nextInt(0, 100)
    println("Please enter a number: ")
    // This line creates an infinite loop because the condition 2 > 1 is always true.
    // This means the loop will keep running indefinitely until it encounters a break statement.
    while (2 > 1) {
        val userGuess: Int = readln().toInt()
        if (userGuess == number) {
            println("Congratulation, you know the number in my mind")
            break
        } else if (userGuess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }

}
package com.example.kotlinpractice

fun main(args: Array<String>) {

    /*for (number in 1..10) {
        println(number)
    }*/

    /*  var sum: Int = 0

      for (x in 0..5) {
          println(x)
          sum += x // sum = sum + x
      }

      println("sum of number = $sum")*/

    /*var sumOfEven: Int = 0
    var sumOfOdd: Int = 0

    for (x in 0..10) {
        if (x % 2 == 0) {
            sumOfEven += x
        } else {
            sumOfOdd += x
        }

    }

    println("sum of number = $sumOfEven")
    println("sum of number = $sumOfOdd")*/

    /*var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for(y in myNumberArray){
        println(y)
    }*/

    /* var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

     for(y in 0..(myNumberArray.size)-1){
         println("myNumberArray[$y] = ${myNumberArray[y]}")
     }*/

    /*var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (y in myNumberArray.indices) {
        println("myNumberArray[$y] = ${myNumberArray[y]}")
    }*/

    //For Each
    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    myNumberArray.forEach { println(it) }
}
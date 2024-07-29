package com.example.kotlinpractice

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('g')
    var myChar = 'k' in myCharRange
    println("mayCharRange has k : $myChar")

    var myIntRange = 1.rangeTo(30)
    var myInt = 15 in myIntRange
    println("myIntRange has 15 : $myInt")

    var myFloatRange = 1.0.rangeTo(10.0)
    var myFloat = 11.0 in myFloatRange
    println("myIntRange has 15 : $myFloat")



}
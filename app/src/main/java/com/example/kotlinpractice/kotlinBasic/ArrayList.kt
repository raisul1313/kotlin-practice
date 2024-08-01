package com.example.kotlinpractice.kotlinBasic

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    var mixArray = ArrayList<Any>()
    var cars = arrayListOf<String>("BMW", "Mercedes", "Audi")

    age.add(10)
    age.add(1, 20)
    age.add(30)

    println("First Element of ArrayList = " + age[0])
    println("Second Element of ArrayList = " + age.get(1))
    println("Third Element of ArrayList = ${age[2]}")
    println("****************")

    age.remove(10)
    println(age.size)
    println("First Element of ArrayList = " + age[0])
    println("Second Element of ArrayList = " + age.get(1))
    println("****************")

    cars.add("Ford")
    println("First Element of ArrayList = " + cars[0])
    println("Second Element of ArrayList = " + cars.get(1))
    println("Third Element of ArrayList = ${cars[2]}")

    mixArray.add(1)
    mixArray.add("Ratul")
    mixArray.add(2.44444)
    mixArray.add(true)
    mixArray.add('K')
    println("****************")
    println("Mix Array : ${mixArray.toString()}")




}
package com.example.sarjinboss

fun main (){
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("number = ${number}")
    println("-number = ${-number}")
    println("+number = ${+number}")
    println("++number = ${++number}")
    println("--number = ${--number}")
    println("isCheck = ${isCheck}")
    println("---------------------------")

    var result: Double = 4.7
    println("result : $result")
// when result++ is executed, the original value is evaluated first
// and the value of result is increased only after that
    println("result++ : " + result++)

}
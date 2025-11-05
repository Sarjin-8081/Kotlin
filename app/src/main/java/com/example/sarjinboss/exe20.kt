package com.example.sarjinboss

import androidx.compose.animation.slideOutVertically

fun main (){
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)

}
package com.example.sarjinboss

fun main(){
    print("Enter name:: ")
    var name:String? = readln()
    //the data user input is always a String so,
    //type conversion for data type other than String
    print("Enter age:: ")
    var age:Int = readln()!!.toInt()
}
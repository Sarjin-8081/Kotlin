package com.example.sarjinboss

fun main() {
    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Mutable List")
    for (i in lst.indices) {
        println(lst[i])
    }

    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Immutable List")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}

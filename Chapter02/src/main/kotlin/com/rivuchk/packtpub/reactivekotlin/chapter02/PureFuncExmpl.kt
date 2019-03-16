package com.rivuchk.packtpub.reactivekotlin.chapter02

fun square(n: Int): Int {//(1)
    return n * n
}

fun main() {
    println("named pure func square = ${com.rivuchk.packtpub.reactivekotlin.chapter02.square(3)}")
    val qube = { n: Int -> n * n * n }//(2)
    println("lambda pure func qube = ${qube(3)}")
}
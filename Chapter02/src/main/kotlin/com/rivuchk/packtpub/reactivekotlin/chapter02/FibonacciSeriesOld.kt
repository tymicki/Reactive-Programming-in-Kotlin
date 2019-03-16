package com.rivuchk.packtpub.reactivekotlin.chapter02

fun main() {
    var a = 0
    var b = 1
    print("$a, ")
    print("$b, ")

    for(i in 2..9) {
        val c = a+b
        print("$c, ")
        a=b
        b=c
    }
}
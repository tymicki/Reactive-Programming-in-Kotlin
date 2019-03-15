package com.rivuchk.packtpub.reactivekotlin.chapter02

/**
 * Created by Rivu Chakraborty on 11-07-2017.
 */

fun Int.isEven() = ((this % 2) == 0)

fun highOrderFunc(a: Int, validityCheckFunc: (a: Int) -> Boolean) {//(1)
    if (validityCheckFunc(a)) {//(2)
        println("a $a is Valid")
    } else {
        println("a $a is Invalid")
    }
}

fun main(args: Array<String>) {
    highOrderFunc(12, { a: Int -> a.isEven() })//(3)
    highOrderFunc(19, { a: Int -> a.isEven() })
}



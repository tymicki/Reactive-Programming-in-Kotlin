package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.Observable

fun main() {
    val observable1 = Observable.range(1, 10)
    val observable2 = Observable.range(11, 10)
    Observable.zip(observable1, observable2, io.reactivex.functions.BiFunction<Int, Int, Int> { emissionO1, emissionO2 ->
        emissionO1 + emissionO2
    }).subscribe {
        println("Received $it")
    }
}
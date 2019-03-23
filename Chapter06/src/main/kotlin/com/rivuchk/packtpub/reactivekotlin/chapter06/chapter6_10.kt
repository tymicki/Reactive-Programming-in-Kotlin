package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.Observable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun main() {
    val observable1 = Observable.interval(500, TimeUnit.MILLISECONDS)
            .take(2)//(1)
            .map { "Observable 1 $it" }//(2)
    val observable2 = Observable.interval(100, TimeUnit.MILLISECONDS).map { "Observable 2 $it" }//(3)

    Observable
            .concat(observable1, observable2)
            .subscribe {
                println("Received $it")
            }

    runBlocking { delay(1500) }
}
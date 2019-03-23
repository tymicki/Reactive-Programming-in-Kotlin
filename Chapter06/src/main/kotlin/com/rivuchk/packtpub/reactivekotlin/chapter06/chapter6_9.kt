package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.Observable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun main() {
    val observable1 = Observable.interval(500, TimeUnit.MILLISECONDS).map { "Observable 1 $it" }//(1)
    val observable2 = Observable.interval(100, TimeUnit.MILLISECONDS).map { "Observable 2 $it" }//(2)

    Observable
            .merge(observable1, observable2)
            .subscribe {
                println("Received $it")
            }

    runBlocking { delay(1500) }
}
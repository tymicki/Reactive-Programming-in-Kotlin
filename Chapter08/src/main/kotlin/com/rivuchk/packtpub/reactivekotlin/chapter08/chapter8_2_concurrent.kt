package com.rivuchk.packtpub.reactivekotlin.chapter8

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    Observable.range(1, 10)
            .subscribeOn(Schedulers.computation())
            .subscribe { item ->
                println("Received $item")
            }
    runBlocking { delay(10) }
}
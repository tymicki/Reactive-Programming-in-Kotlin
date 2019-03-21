package com.rivuchk.packtpub.reactivekotlin.chapter04

import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    val source = Observable.range(1, 1000)
    source.toFlowable(BackpressureStrategy.DROP)
            .map { MyItem10(it) }
            .observeOn(Schedulers.io())
            .subscribe {
                println(it)
                runBlocking { delay(1000) }
            }
    runBlocking { delay(700000) }
}

data class MyItem10(val id: Int) {
    init {
        println("MyItem Created $id")
    }
}
package com.rivuchk.packtpub.reactivekotlin.chapter04

import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    val source = Observable.range(1, 1000)
    source.toFlowable(BackpressureStrategy.MISSING)//(1)
            .onBackpressureLatest()//(2)
            .map { MyItem13(it) }
            .observeOn(Schedulers.io())
            .subscribe {
                print("-> $it;\t")
                runBlocking { delay(100) }
            }
    runBlocking { delay(600000) }
}

data class MyItem13(val id: Int) {
    init {
        print("init $id;\t")
    }
}
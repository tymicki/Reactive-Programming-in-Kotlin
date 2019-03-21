package com.rivuchk.packtpub.reactivekotlin.chapter04

import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    val source = Observable.range(1, 1000)
    source.toFlowable(BackpressureStrategy.MISSING)//(1)
            .onBackpressureDrop { print("Dropped $it;\t") }//(2)
            .map { MyItem12(it) }
            .observeOn(Schedulers.io())
            .subscribe {
                print("Rec. $it;\t")
                runBlocking { delay(1000) }
            }
    runBlocking { delay(600000) }
}

data class MyItem12(val id: Int) {
    init {
        print("MyItem init $id\t")
    }
}
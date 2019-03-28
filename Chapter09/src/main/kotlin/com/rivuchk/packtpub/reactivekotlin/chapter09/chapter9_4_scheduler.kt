package com.rivuchk.packtpub.reactivekotlin.chapter09

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    Observable.range(1, 10)
            .map {
                println("map - ${Thread.currentThread().name} $it")
                it
            }
            .subscribeOn(Schedulers.computation())
            .observeOn(Schedulers.io())
            .subscribe {
                println("onNext - ${Thread.currentThread().name} $it")
            }

    runBlocking { delay(100) }
}
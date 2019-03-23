package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.Observable

fun main() {
    val observable = Observable.range(1, 30)

    observable.groupBy {
        it % 5
    }.blockingSubscribe {
        println("Key ${it.key} ")
        it.subscribe {
            println("Received $it")
        }
    }
}
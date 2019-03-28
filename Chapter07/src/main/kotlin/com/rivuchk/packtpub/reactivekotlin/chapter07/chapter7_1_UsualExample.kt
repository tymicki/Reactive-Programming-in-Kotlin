package com.rivuchk.packtpub.reactivekotlin.chapter7

import io.reactivex.Observable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    Observable.range(1, 10)
            .subscribe {
                runBlocking { delay(200) }
                println("Observable1 Item Received $it")
            }

    Observable.range(21, 10)
            .subscribe {
                runBlocking { delay(100) }
                println("Observable2 Item Received $it")
            }
}
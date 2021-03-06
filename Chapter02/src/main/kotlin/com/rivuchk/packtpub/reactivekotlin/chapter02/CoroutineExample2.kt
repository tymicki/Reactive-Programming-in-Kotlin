package com.rivuchk.packtpub.reactivekotlin.chapter02

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() {
    val time = GlobalScope.async { longRunningTsk() }
    println("Print after async ")
    runBlocking { println("printing time ${time.await()}") }
}
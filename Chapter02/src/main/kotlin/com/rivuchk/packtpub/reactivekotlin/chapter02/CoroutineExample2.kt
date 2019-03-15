package com.rivuchk.packtpub.reactivekotlin.chapter02

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

/**
 * Created by rivuc on 13-07-2017.
 */

fun main(args: Array<String>) {
    val time = GlobalScope.async { longRunningTsk() }
    println("Print after async ")
    runBlocking { println("printing time ${time.await()}") }
}
package com.rivuchk.packtpub.reactivekotlin.chapter02

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun longRunningTsk():Long {//(1)
    val time = measureTimeMillis {//(2)
        println("Please wait")
        delay(2000)//(3)
        println("Delay Over")
    }
    return time
}

fun main() {
    runBlocking {//(4)
        val exeTime = longRunningTsk()//(5)
        println("Execution Time is $exeTime")
    }
}
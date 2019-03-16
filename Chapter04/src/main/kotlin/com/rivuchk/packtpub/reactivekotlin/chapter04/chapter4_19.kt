package com.rivuchk.packtpub.reactivekotlin.chapter04

import io.reactivex.Flowable

fun main() {
    val flowable = Flowable.range(1, 111)//(1)
    flowable.buffer(10)
            .subscribe { println(it) }
}
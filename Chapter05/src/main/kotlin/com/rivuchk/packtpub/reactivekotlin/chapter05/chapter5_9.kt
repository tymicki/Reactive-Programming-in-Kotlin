package com.rivuchk.packtpub.reactivekotlin.chapter05

import io.reactivex.Observable

fun main() {
    Observable.range(0, 10)//(1)
            .filter { it > 15 }//(2)
            .subscribe({
                println("Received $it")
            })
}

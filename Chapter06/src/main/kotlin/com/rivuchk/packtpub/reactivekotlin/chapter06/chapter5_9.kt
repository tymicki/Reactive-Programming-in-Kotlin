package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

fun main() {
    val observable = Observable.range(1, 20)
    observable
            .skipLast(5)//(1)
            .subscribe(object : Observer<Int> {
                override fun onError(e: Throwable) {
                    println("Error $e")
                }
                override fun onComplete() {
                    println("Complete")
                }
                override fun onNext(t: Int) {
                    println("Received $t")
                }
                override fun onSubscribe(d: Disposable) {
                    println("starting skipLast(count)")
                }
            })
}
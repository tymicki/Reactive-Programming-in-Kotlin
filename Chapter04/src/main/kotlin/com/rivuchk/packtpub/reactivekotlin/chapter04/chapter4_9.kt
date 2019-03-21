package com.rivuchk.packtpub.reactivekotlin.chapter04

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

fun main() {
    val subscriber: Subscriber<Int> = object : Subscriber<Int> {
        override fun onComplete() {
            println("All Completed")
        }
        override fun onNext(item: Int) {
            println("Next $item")
        }
        override fun onError(e: Throwable) {
            println("Error Occurred ${e.message}")
        }
        override fun onSubscribe(subscription: Subscription) {
            println("New Subscription ")
            subscription.request(10)
        }
    }//(1)
    val flowable: Flowable<Int> = Flowable.create<Int>({
        for (i in 1..10) {
            it.onNext(i)
        }
        it.onComplete()
    }, BackpressureStrategy.BUFFER)//(2)
    flowable.observeOn(Schedulers.io()).subscribe(subscriber)//(3)
    runBlocking { delay(10000) }
}

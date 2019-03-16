package com.rivuchk.packtpub.reactivekotlin.chapter03

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun main() {
    val observable = Observable.interval(100, TimeUnit.MILLISECONDS)//1
    val subject = PublishSubject.create<Long>()//2
    observable.subscribe(subject)//3
    subject.subscribe({
        //4
        println("Subscription 1 Received $it")
    })
    runBlocking { delay(1100) }//5
    subject.subscribe({
        //6
        println("Subscription 2 Received $it")
    })
    runBlocking { delay(1100) }//7
}
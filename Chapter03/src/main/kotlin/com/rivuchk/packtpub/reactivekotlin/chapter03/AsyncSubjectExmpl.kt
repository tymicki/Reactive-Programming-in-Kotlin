package com.rivuchk.packtpub.reactivekotlin.chapter03

import io.reactivex.Observable
import io.reactivex.subjects.AsyncSubject

fun main() {
    val observable = Observable.just(1, 2, 3, 4)//1
    val subject = AsyncSubject.create<Int>()//2
    observable.subscribe(subject)//3
    subject.subscribe({
        //4
        //onNext
        println("Received $it")
    }, {
        //onError
        it.printStackTrace()
    }, {
        //onComplete
        println("Complete")
    })
    subject.onNext(5)//5
    subject.onComplete()//6
}
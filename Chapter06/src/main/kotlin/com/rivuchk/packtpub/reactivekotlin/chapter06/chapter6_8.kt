package com.rivuchk.packtpub.reactivekotlin.chapter06

import io.reactivex.rxkotlin.toObservable

fun main() {
    val observable1 = listOf("Kotlin", "Scala", "Groovy").toObservable()
    val observable2 = listOf("Python", "Java", "C++", "C").toObservable()

    observable1
            .mergeWith(observable2)
            .subscribe {
                println("Received $it")
            }
}
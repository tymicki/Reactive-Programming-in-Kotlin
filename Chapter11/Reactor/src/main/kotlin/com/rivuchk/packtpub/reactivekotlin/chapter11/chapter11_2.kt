package com.rivuchk.packtpub.reactivekotlin.chapter11

import reactor.core.publisher.Mono
import reactor.core.publisher.toMono
import java.util.function.Consumer

fun main() {
    val subscriber = Consumer<String> { item -> println("Got $item") }
    val emptyMono = Mono.empty<String>()
    emptyMono.log().subscribe(subscriber)

    val emptyMono2 = Mono.justOrEmpty<String>(null)
    emptyMono2.log().subscribe(subscriber)

    val monoWithData = Mono.justOrEmpty<String>("A String")
    monoWithData.log().subscribe(subscriber)

    val monoByExtension = "Another String".toMono()
    monoByExtension.log().subscribe(subscriber)
}
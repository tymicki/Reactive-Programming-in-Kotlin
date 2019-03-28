package com.rivuchk.packtpub.reactivekotlin.chapter09

import io.reactivex.Observable
import java.io.Closeable


fun main() {
    Observable.using({
        Resource()
    }, { resource: Resource ->
        Observable.just(resource)
    }, { resource: Resource ->
        resource.close()
    }).subscribe {
        println("Resource Data ${it.data}")
    }
}

class Resource : Closeable {

    init {
        println("Resource Created")
    }

    val data: String = "Hello World"

    override fun close() {
        println("Resource Closed")
    }
}

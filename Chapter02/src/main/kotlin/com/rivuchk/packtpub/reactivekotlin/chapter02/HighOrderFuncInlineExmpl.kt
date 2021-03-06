package com.rivuchk.packtpub.reactivekotlin.chapter02

inline fun highOrderFuncInline(a:Int, validityCheckFunc:(a:Int)->Boolean) {//(1)
    if(validityCheckFunc(a)) {//(2)
        println("a $a is Valid")
    } else {
        println("a $a is Invalid")
    }
}

fun main() {
    highOrderFuncInline(12,{ a:Int -> a.isEven()})//(3)
    highOrderFuncInline(19,{ a:Int -> a.isEven()})
}

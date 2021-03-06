package com.rivuchk.packtpub.reactivekotlin.chapter06

inline fun Int.isEven(): Boolean = (this % 2) == 0

inline infix fun Sequence<Any>.join(delimeter: String): String {
    var retString = ""
    this.forEach {
        retString += "$it${delimeter.trim()} "
    }
    return retString.substring(0, retString.lastIndexOf(delimeter)).trim()
}

inline fun Any.toIntOrError(): Int = toString().toInt()

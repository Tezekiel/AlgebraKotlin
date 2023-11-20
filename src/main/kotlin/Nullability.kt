package com.algebra

fun main() {

    val str: String? = "This isn't null"
    str?.let { printText(it) }

    val str4 : String? = null
    val anotherStr = "This isn't nullable"
    println(str4 == anotherStr)

    val str2 = str!!
    val str3: String = str2.toUpperCase()

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    println("-----")
    println(nullableInts[3].toString())
    println(nullableInts[3]?.let { println("this is not null $it") })

    nullableInts[3].toString()

    var int = nullableInts[3]?: 3
    println(int)

    nullableInts[3] = 5

    int = nullableInts[3]?: 3
    println(int)
}

fun printText(text: String) {
    println(text)
}


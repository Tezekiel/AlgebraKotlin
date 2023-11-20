package com.algebra

import java.math.BigDecimal

fun main() {
    val names = arrayOf("Ivan", "Marko", "Ana", "Pero")

    val longs1 = arrayOf(1L, 2, 3)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)
    println(names is Array<String>)

    println(longs1[2])
    println(longs1.get(2))
    println(longs1.size)

    longs1[0] = 5
    longs1.set(0, 5)

    println("-------")
    longs1.forEach {
        println(it)
    }

    val evenNumbers = Array(16) { i -> i * 2 }
    evenNumbers.forEach {
        println(it)
    }
    println("-------")

    println("empty")
    val empty = arrayOfNulls<Int?>(20)
    empty[3] = 5
    empty[0] = 10
    empty[10] = 100
    empty.print()

    println("-------")

    for (number in evenNumbers) {
        println(number)
    }

//      Ili ovako
//    evenNumbers.toIntArray().printInt()

    val lotsOfNumbers = Array(100_000) { i -> i + 1 }

    val allZeroes = Array(100) { 0 } // identicno IntArray(100)

    println("-------")
    var someArray: Array<Int> = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    println("-------")
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    println("mixedArray")
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println("-------")
    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    myIntArray.printInt()

    println("-------")
    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println(number)
    }

}

fun<T> Array<T>.print(){
    this.forEachIndexed { index, value ->
        println("Array[$index] = $value")
    }
}

fun IntArray.printInt(){
    this.forEachIndexed { index, value ->
        println("Array[$index] = $value")
    }
}

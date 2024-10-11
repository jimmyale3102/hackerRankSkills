package dev.alejo.unosquareskilltest.easy

import android.icu.text.DecimalFormat

object Types {
    const val POSITIVE = 0
    const val NEGATIVE = 1
    const val ZERO = 2
}

fun plusMinus(arr: Array<Int>): Unit {
    val count = Array<Double>(3) { 0.0 }
    for(number in arr) {
        if (number > 0) {
            count[Types.POSITIVE]++
        }
        if (number < 0) {
            count[Types.NEGATIVE]++
        }
        if (number == 0) {
            count[Types.ZERO]++
        }
    }
    val results = count.map { "%.6f".format(it/arr.size) }
    results.forEach {
        println(it)
    }
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
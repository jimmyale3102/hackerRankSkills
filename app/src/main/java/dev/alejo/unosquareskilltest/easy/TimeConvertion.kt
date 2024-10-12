package dev.alejo.unosquareskilltest.easy

/*
Problem description: https://www.hackerrank.com/challenges/time-conversion/problem
 */

fun timeConversion(s: String): String {
    val period = s.takeLast(2)
    var hours = s.substring(0, 2).toInt()
    val rest = s.substring(2, 8)

    hours = when {
        period == "AM" && hours == 12 -> 0
        period == "PM" && hours != 12 -> hours + 12
        else -> hours
    }

    return String.format("%02d$rest", hours)
}

fun main(args: Array<String>) {
    val s = readln()

    val result = timeConversion(s)

    println(result)
}
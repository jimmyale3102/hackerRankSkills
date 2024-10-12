package dev.alejo.unosquareskilltest.easy

/*
Problem description: https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
fun miniMaxSum(arr: Array<Int>): Unit {
    var minSum: Long = 0
    var maxSum: Long = 0
    arr.sortedArray().take(4).forEach {
        minSum += it
    }
    arr.sortedArrayDescending().take(4).forEach {
        maxSum += it
    }
    print("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
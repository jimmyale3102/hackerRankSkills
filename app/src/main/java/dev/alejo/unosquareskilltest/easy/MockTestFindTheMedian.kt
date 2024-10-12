package dev.alejo.unosquareskilltest.easy

/*
Problem description: https://www.hackerrank.com/challenges/find-the-median/problem
 */

fun main() {
    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    print(getMiddle(a))
}

fun getMiddle(arr: Array<Int>): Int {
    val position = (arr.size/2).toInt()
    return arr.sorted()[position]
}
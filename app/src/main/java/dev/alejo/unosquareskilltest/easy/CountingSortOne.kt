package dev.alejo.unosquareskilltest.easy

fun countingSort(arr: Array<Int>): Array<Int> {
    val frequency = Array<Int>(100) { 0 }
    for(number in arr) {
        frequency[number]++
    }
    return frequency
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}
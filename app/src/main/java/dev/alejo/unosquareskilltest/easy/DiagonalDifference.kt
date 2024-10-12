package dev.alejo.unosquareskilltest.easy

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonal = 0
    var rightDiagonal = 0
    for(i in arr.indices) {
        for(j in arr[i].indices ) {
            if (i == j) {
                leftDiagonal += arr[i][j]
            }
            if ((i + j) == (arr.size - 1)) {
                println("Sum: $i + $j ${arr.size}")
                rightDiagonal += arr[i][j]
                println(rightDiagonal)
            }
        }
    }
    return abs(leftDiagonal - rightDiagonal)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
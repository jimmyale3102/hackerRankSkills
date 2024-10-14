package dev.alejo.unosquareskilltest.easy

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    val n = matrix.size / 2
    var maxSum = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            val topLeft = matrix[i][j]
            val topRight = matrix[i][2 * n - 1 - j]
            val bottomLeft = matrix[2 * n - 1 - i][j]
            val bottomRight = matrix[2 * n - 1 - i][2 * n - 1 - j]

            maxSum += maxOf(topLeft, topRight, bottomLeft, bottomRight)
        }
    }

    return maxSum
}

fun printMatrix(matrix: Array<Array<Int>>) {
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val n = readln().trim().toInt()

        val matrix = Array<Array<Int>>(2 * n) { Array<Int>(2 * n) { 0 } }

        for (i in 0 until 2 * n) {
            matrix[i] = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        }

        val result = flippingMatrix(matrix)

        println(result)
    }
}

/*
1
2
112 42 83 119
56 125 56 49
15 78 101 43
62 98 114 108

1
1
1 2
3 4
 */
package dev.alejo.unosquareskilltest.second

fun getMinimumCost(arr: Array<Int>): Long {
    var maxDiff = 0
    var min = 0
    var minIndexDiff = 0
    var maxIndexDiff = 0
    for(i in 1 until arr.size) {
        var diff = (arr[i] - arr[i - 1])
        if (diff < 0) {
            diff *= (-1)
        }
        if (diff > maxDiff) {
            min = if (arr[i] <= arr[i - 1]) arr[i] else arr[i - 1]
            minIndexDiff = i - 1
            maxIndexDiff = i
            maxDiff = diff
        }
    }
    val n = (maxDiff/2) + min
    val newArray = Array<Int>(arr.size + 1) { 0 }
    for(i in newArray.indices) {
        if (i <= minIndexDiff) {
            newArray[i] = arr[i]
        } else if (i > maxIndexDiff) {
            newArray[i] = arr[i - 1]
        } else {
            newArray[i] = n
        }
    }
    var cost = 0
    for (i in 1 until newArray.size) {
        cost += Math.pow((newArray[i] - newArray[i - 1]).toDouble(), 2.0).toInt()
    }
    return cost.toLong()
}

fun main(args: Array<String>) {
    val arrCount = readln().trim().toInt()

    val arr = Array<Int>(arrCount) { 0 }
    for (i in 0 until arrCount) {
        val arrItem = readln().trim().toInt()
        arr[i] = arrItem
    }

    val result = getMinimumCost(arr)

    println(result)
}

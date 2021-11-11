package leetcode

import kotlin.math.abs

class GoodTriplets {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        val n = arr.size - 1
        val intRange = 0..n
        var counter = 0
        for (i in intRange) {
            for (j in (i+1)..n) {
                for (k in (j+1)..n) {
                    if (abs(arr[i] - arr[j]) <= a &&
                        abs(arr[j] - arr[k]) <= b &&
                        abs(arr[i] - arr[k]) <= c
                    ) {
                        counter++
                    }
                }
            }
        }
        return counter
    }
}

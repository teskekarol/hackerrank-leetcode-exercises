package leetcode

import kotlin.math.abs

class MaxMoney {
    fun maxCoins(piles: IntArray): Int {
        val sorted = piles.sortedArray().reversedArray()

        var left = 0
        var right = piles.size-1
        var sum = 0
        while (abs(left-right) > 1){
            right-=1
            sum+=sorted[left+1]
            left+=2
        }

        return sum
    }
}

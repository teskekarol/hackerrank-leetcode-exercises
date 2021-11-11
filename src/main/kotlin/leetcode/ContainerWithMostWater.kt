package leetcode

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left != right) {
            val leftValue = height[left]
            val rightValue = height[right]

            val area = min(leftValue, rightValue) * (right-left)
            maxArea = max(maxArea, area)

            if(leftValue < rightValue) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}

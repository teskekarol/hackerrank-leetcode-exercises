package leetcode

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        nums.forEachIndexed { index, i ->
            result[index] = i + result.getOrElse(index-1) { 0 }
        }

        return result
    }
}

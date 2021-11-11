package leetcode

class Shuffle {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val result = IntArray(nums.size)

        for ((left, i) in (0 until 2*n step 2).withIndex()) {
            result[i] = nums[left]
            result[i+1] = nums[(left)+n]
        }

        return result
    }
}

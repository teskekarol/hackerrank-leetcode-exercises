class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val results = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (results.containsKey(target - nums[i])){
                return intArrayOf(results.getOrDefault(target - nums[i],0), i)
            }
            results[nums[i]] = i
        }

        return IntArray(0)
    }
}

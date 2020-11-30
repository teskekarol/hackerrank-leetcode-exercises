class CheckPossibility {
    fun checkPossibility(nums: IntArray): Boolean {
        for(elem in 0 until nums.size-1) {
            if(nums[elem] > nums[elem+1]){
                val toLeft = nums.copyOf()
                val toRight = nums.copyOf()
                toLeft[elem] = nums.getOrElse(elem-1) { 0 }
                toRight[elem+1] = nums.getOrElse(elem+2) { Int.MAX_VALUE }
                return checkDecreasing(toLeft) || checkDecreasing(toRight)
            }
        }
        return true
    }

    private fun checkDecreasing(nums: IntArray): Boolean {
        for(elem in 0 until nums.size-1) {
            if(nums[elem] > nums[elem+1]){
                return false
            }
        }
        return true
    }
}

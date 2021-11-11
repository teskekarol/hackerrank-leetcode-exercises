package leetcode
class RepeatedNTimes {
    fun repeatedNTimes(input: IntArray): Int {
        val numSet = mutableSetOf<Int>()
        for (i in (0..(input.size))){
            if(!numSet.add(input[i])) {
                return input[i]
            }
        }
        return -1
    }
}

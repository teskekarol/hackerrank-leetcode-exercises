package leetcode

class IsHappy {
    fun isHappy(n: Int): Boolean {
        val savedResults = mutableSetOf<Int>()

        var next = n
        while(next != 1){
            next = next
                .toString()
                .split("")
                .filter { it!="" }
                .map { it.toInt()*it.toInt() }
                .sum()
            if (savedResults.contains(next)){
                return false
            } else {
                savedResults.add(next)
            }
        }

        return true
    }
}

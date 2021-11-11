package leetcode

class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false

        val stringed = x.toString().toCharArray()
        var left = 0
        var right = stringed.size - 1

        while(left < right) {
            if(stringed[left] != stringed[right]){
                return false
            }

            left++
            right--
        }

        return true
    }
}

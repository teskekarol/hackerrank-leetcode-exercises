package leetcode

import kotlin.math.abs

class ReverseInteger {
    fun reverse(x: Int): Int = runCatching { resolve(x) }
        .getOrDefault(0)

    private fun resolve(x: Int) = if (x < 0) {
        -abs(x).reversed()
    } else {
        x.reversed()
    }

    private fun Int.reversed() = String(this.toString().toCharArray().reversedArray()).toInt()
}

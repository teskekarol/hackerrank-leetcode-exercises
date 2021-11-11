package leetcode

import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.abs
import kotlin.streams.toList

class MissingBrackets {

    fun fillMissingBrackets(s: String): Int {
        if (s.length < 3) return 0
        if (s.length % 2 != 0) {
            return 0
        }
        val substrings = mutableListOf<Pair<CharSequence, CharSequence>>()
        val result = AtomicInteger(0)
        repeat(s.length / 2 - 1) {
            val divider = (it + 1) * 2
            val left = s.subSequence(0, divider)
            val right = s.subSequence(divider, s.length)
            substrings.add(Pair(left, right))
        }

        val res = substrings.parallelStream()
            .map {
                if (isBalanced(it.first) && isBalanced(it.second)) {
                    result.incrementAndGet()
                } else {
                    0
                }
            }
            .toList()
            .sum()

        return result.toInt()
    }

    private fun isBalanced(s: CharSequence): Boolean {
        var balanceCurvy = 0
        var balanceSquare = 0
        var jokers = 0

        s.forEach {
            when (it) {
                '(' -> {
                    balanceCurvy++
                }
                ')' -> {
                    balanceCurvy--
                }
                '[' -> {
                    balanceSquare++
                }
                ']' -> {
                    balanceSquare--
                }
                else -> {
                    jokers++
                }
            }
        }

        val missing = abs(balanceSquare) + abs(balanceCurvy)
        return when {
            missing > jokers -> false
            missing == jokers -> true
            else -> ((jokers - missing) % 2) == 0
        }
    }

}



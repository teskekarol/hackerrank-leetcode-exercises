package leetcode

import kotlin.math.abs

class FlipAndInvert {
    fun flipAndInvertImage(input: Array<IntArray>) =
        input.map { it.flipAndReverse() }
            .toTypedArray()

    private fun IntArray.flipAndReverse() =
        map { elem -> abs(elem - 1) }
            .reversed()
            .toIntArray()
}

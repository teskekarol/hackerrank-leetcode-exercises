package leetcode

class CanFormArray {
    fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
        val map = mutableMapOf<Int, IntArray>()
        for (piece in pieces) {
            map[piece[0]] = piece
        }
        val result = ArrayList<Int>(arr.size)

        val emptyArr = IntArray(0)

        for (elem in arr) {
            val elements = map[elem] ?: emptyArr
            elements.forEach { result.add(it) }
        }

        return result.toIntArray().contentEquals(arr)
    }
}

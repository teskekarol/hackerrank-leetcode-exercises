package leetcode
class SortArrayByParity {
    fun sortArrayByParity(input: IntArray): IntArray = input
            .sortedWith(Comparator { a, _ ->
                if (a % 2 == 0) -1 else 1
            })
            .toIntArray()
}

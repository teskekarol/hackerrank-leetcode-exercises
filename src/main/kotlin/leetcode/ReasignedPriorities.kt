package leetcode

class ReasignedPriorities {

    fun reassignedPriorities(priorities: Array<Int>): Array<Int> {
        val priorityToPosition = priorities
            .distinct()
            .sorted()
            .mapIndexed { index, i -> Pair(i, index) }
            .toMap()

        return priorities.map { priorityToPosition.getOrDefault(it, 0) + 1 }.toTypedArray()
    }
}

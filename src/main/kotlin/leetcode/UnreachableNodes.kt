package leetcode

class UnreachableNodes {
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        val unreachableNodes = (0 until n)
            .map { it }
            .toMutableSet()

        edges.forEach { connection ->
            unreachableNodes.remove(connection[1])
        }

        return unreachableNodes.toList()
    }
}

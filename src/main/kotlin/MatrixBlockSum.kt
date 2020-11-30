class MatrixBlockSum {
    fun matrixBlockSum(mat: Array<IntArray>, K: Int): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size

        val answer = Array(m) { IntArray(n) }

        mat.forEachIndexed { i, indexes ->
            indexes.forEachIndexed { j, _ ->
                answer[i][j] = (maxOf(0, i-K)..minOf(m-1, i+K)).fold(0) { acc, r ->
                    acc + (maxOf(0, j-K)..minOf(n-1, j+K)).fold(0) { acc, c-> acc + mat[r][c] }
                }
            }
        }

        return answer
    }
}

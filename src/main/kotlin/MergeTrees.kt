class MergeTrees {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        return calculate(t1, t2)
    }

    private fun calculate(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null
        t1?.`val` = (t1?.`val` ?: 0) + (t2?.`val` ?: 0)
        t1?.left = calculate(t1?.left, t2?.left)
        t1?.right = calculate(t1?.right, t2?.right)
        return t1
    }
}

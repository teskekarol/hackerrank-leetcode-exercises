/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */

data class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class FindElements(root: TreeNode?) {
    val elements = mutableSetOf<Int>()

    init {
        fixTree(root)
    }

    private fun fixTree(node: TreeNode?){
        return fix(0, node)
    }

    private fun fix(newValue: Int, node: TreeNode?){
        if (node == null) {
            return
        }
        val treeNode = TreeNode(newValue)
        elements.add(newValue)
        if (node.left != null) {
            fix(2 * treeNode.`val` + 1, node.left)
        }
        if (node.right != null) {
            fix(2 * treeNode.`val` + 2, node.right)
        }
    }

    fun find(target: Int): Boolean = elements.contains(target)

}

/**
 * Your FindElements object will be instantiated and called as such:
 * var obj = FindElements(root)
 * var param_1 = obj.find(target)
 */

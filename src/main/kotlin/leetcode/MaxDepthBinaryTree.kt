package leetcode

class MaxDepthBinaryTree {
    fun maxDepth(root: TreeNode?): Int = if (root == null) {
        0
    } else {
        maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}

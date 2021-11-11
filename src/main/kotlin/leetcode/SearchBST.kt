package leetcode

class SearchBST {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? = when {
        root == null || root.`val` == `val` -> root
        root.`val` > `val` -> searchBST(root.left, `val`)
        else -> searchBST(root.right, `val`)
    }
}

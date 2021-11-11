package leetcode

import leetcode.MaxDepthBinaryTree
import leetcode.TreeNode
import spock.lang.Specification

class MaxDepthBinaryTreeSpec extends Specification {

    def solution = new MaxDepthBinaryTree()

    def "should solve simple case"(){
        given:
        def root = new TreeNode(3)
        root.left = new TreeNode(9)
        root.right = new TreeNode(20)
        root.right.right = new TreeNode(7)
        root.right.left = new TreeNode(15)

        when:
        def result = solution.maxDepth(root)

        then:
        result == 3
    }

    def "should handle null head"(){
        given:
        def root = null

        when:
        def result = solution.maxDepth(root)

        then:
        result == 0
    }

    def "should handle single head"(){
        given:
        def root = new TreeNode(0)

        when:
        def result = solution.maxDepth(root)

        then:
        result == 1

    }
}

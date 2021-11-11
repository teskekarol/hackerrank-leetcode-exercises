package leetcode

import leetcode.MergeTrees
import leetcode.TreeNode
import spock.lang.Specification

class MergeTreesSpec extends Specification {

    def solution = new MergeTrees()

    def "should merge root nodes"(){
        given:
        def t1 = new TreeNode(3)
        def t2 = new TreeNode(5)

        when:
        def result = solution.mergeTrees(t1, t2)

        then:
        result.val == 8
    }

    def "should solve null and one"(){
        given:
        def t1 = new TreeNode(3)
        t1.right = new TreeNode(3)
        t1.left = new TreeNode(5)
        def t2 = new TreeNode(3)
        t2.left = new TreeNode(5)

        and:
        def expectedResult = new TreeNode(6)
        expectedResult.right = new TreeNode(3)
        expectedResult.left = new TreeNode(10)

        when:
        def result = solution.mergeTrees(t1, t2)

        then:
        expectedResult == result

    }

}

import spock.lang.Specification

class SearchBSTTest extends Specification {

    def solution = new SearchBST()

    def "should simple case"(){
        given:
        def root = new TreeNode(4)
        root.left = new TreeNode(2)
        root.left.left = new TreeNode(1)
        root.left.right = new TreeNode(3)
        root.right = new TreeNode(7)

        when:
        def result = solution.searchBST(root, 2)

        then:
        result == root.left
    }

    def "should not find value case"(){
        given:
        def root = new TreeNode(4)
        root.left = new TreeNode(2)
        root.left.left = new TreeNode(1)
        root.left.right = new TreeNode(3)
        root.right = new TreeNode(7)

        when:
        def result = solution.searchBST(root, 6)

        then:
        result == null
    }

    def "should find value leaf on right side"(){
        given:
        def root = new TreeNode(4)
        root.left = new TreeNode(2)
        root.left.left = new TreeNode(1)
        root.left.right = new TreeNode(3)
        root.right = new TreeNode(7)

        when:
        def result = solution.searchBST(root, 7)

        then:
        result == root.right
    }
}

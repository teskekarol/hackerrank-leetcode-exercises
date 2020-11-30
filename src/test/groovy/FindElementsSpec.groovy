import spock.lang.Specification

class FindElementsSpec extends Specification {


    def "should run"(){
        given:
        def root = new TreeNode(-1)
        root.right = new TreeNode(-1)

        def solution = new FindElements(root)

        when:
        def result = solution.find(1)

        then:
        !result

        when:
        result = solution.find(2)

        then:
        result
    }

    def "should fix tree recurrently"(){
        given:
        def root = new TreeNode(-1)
        root.right = new TreeNode(-1)
        root.right.right = new TreeNode(-1)

        when:
        def solution = new FindElements(root)

        then:
        solution.elements.containsAll([0,2,6])
    }

    def "should solve hard case"(){
        given:
        def root = new TreeNode(-1)
        root.right = new TreeNode(-1)
        root.right.left = new TreeNode(-1)
        root.right.left.left = new TreeNode(-1)

        when:
        def solution = new FindElements(root)

        then:
        solution.elements == [0,2,5,11] as Set

    }
}

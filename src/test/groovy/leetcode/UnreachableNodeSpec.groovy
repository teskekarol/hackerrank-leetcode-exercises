package leetcode

import leetcode.UnreachableNodes
import spock.lang.Specification

class UnreachableNodeSpec extends Specification {

    def solution = new UnreachableNodes()

    def "should handle simple case"(){
        when:
        def result = solution.findSmallestSetOfVertices(2, [[0,1]])

        then:
        result == [0]
    }

    def "should handle example 1"(){
        given:
        def data = [[0,1],[0,2],[2,5],[3,4],[4,2]]

        when:
        def result = solution.findSmallestSetOfVertices(6, data)

        then:
        result == [0, 3]
    }

    def "should handle example 2"(){
        given:
        def data = [[0,1],[2,1],[3,1],[1,4],[2,4]]

        when:
        def result = solution.findSmallestSetOfVertices(5, data)

        then:
        result == [0,2,3]
    }
}

package leetcode

import leetcode.FlipAndInvert
import spock.lang.Specification

class FlipAndInvertSpec extends Specification {

    def solution = new FlipAndInvert()

    def "should handle simple case"() {
        given:
        def input = [[1, 1, 0], [1, 0, 1], [0, 0, 0]] as int[][]
        def expectedResult = [[1, 0, 0], [0, 1, 0], [1, 1, 1]] as int[][]

        when:
        def result = solution.flipAndInvertImage(input)

        then:
        result == expectedResult
    }

    def "should handle complexier case"() {
        given:
        def input = [[1, 1, 0, 0], [1, 0, 0, 1], [0, 1, 1, 1], [1, 0, 1, 0]] as int[][]
        def expectedResult = [[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]] as int[][]

        when:
        def result = solution.flipAndInvertImage(input)

        then:
        result == expectedResult
    }

}

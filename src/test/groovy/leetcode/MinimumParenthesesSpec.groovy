package leetcode

import leetcode.MinimumParentheses
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class MinimumParenthesesSpec extends Specification {

    @Subject
    def solution = new MinimumParentheses()

    @Unroll
    def "should work for '#input'"() {
        when:
        def result = solution.minAddToMakeValid(input)

        then:
        result == expectedResult

        where:
        input    || expectedResult
        "())"    || 1
        "((("    || 3
        "()"     || 0
        ""       || 0
        "()))((" || 4
        ")()("   || 2
    }

    @Unroll
    def "should return string with parentheses cut"() {
        when:
        def result = solution.iterate(input)

        then:
        result == expectedResult

        where:
        input || expectedResult
        "()"  || ""
        "())" || ")"
        "(()" || "("
    }

}

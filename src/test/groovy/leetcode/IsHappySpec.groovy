package leetcode

import leetcode.IsHappy
import spock.lang.Specification

class IsHappySpec extends Specification {

    def solution = new IsHappy()

    def "should solve happiness"(){
        given:
        def input = 19

        when:
        def result = solution.isHappy(input)

        then:
        result
    }
}

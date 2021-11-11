package leetcode

import leetcode.CheckPossibility
import spock.lang.Specification

class CheckPossibilitySpec extends Specification {

    def solution = new CheckPossibility()

    def "should solve simple case"(){
        given:
        def input = [4,2,3]

        when:
        def result = solution.checkPossibility(input as int[])

        then:
        result
    }

    def "should solve false case"(){
        given:
        def input = [4,2,1]

        when:
        def result = solution.checkPossibility(input as int[])

        then:
        !result
    }

    def "should solve tricky case"(){
        given:
        def input = [3,4,2,3]

        when:
        def result = solution.checkPossibility(input as int[])

        then:
        !result
    }

    def "should solve tricky case2"(){
        given:
        def input = [1,3,2]

        when:
        def result = solution.checkPossibility(input as int[])

        then:
        result
    }

    def "should solve tricky case3"(){
        given:
        def input = [5,7,1,8]

        when:
        def result = solution.checkPossibility(input as int[])

        then:
        result
    }

}

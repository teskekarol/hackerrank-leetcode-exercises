package leetcode

import leetcode.DiStringMatch
import spock.lang.Specification

class DiStringMatchSpec extends Specification {

    def solution = new DiStringMatch()

    def "should solve simple case"(){
        given:
        def input = "IDID"

        when:
        def result = solution.diStringMatch(input)

        then:
        result == [0,4,1,3,2] as int[]
    }

    def "should solve second case"(){
        given:
        def input = "III"

        when:
        def result = solution.diStringMatch(input)

        then:
        result == [0,1,2,3] as int[]
    }

    def "should solve third case"(){
        given:
        def input = "DDI"

        when:
        def result = solution.diStringMatch(input)

        then:
        result == [3,2,0,1] as int[]
    }


}

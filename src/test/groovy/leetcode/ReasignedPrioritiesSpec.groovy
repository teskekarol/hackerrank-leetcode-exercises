package leetcode

import leetcode.ReasignedPriorities
import spock.lang.Specification

class ReasignedPrioritiesSpec extends Specification {

    def solution = new ReasignedPriorities()

    def "should solve"(){
        given:
        def input = [1 ,3 ,7 ,3] as Integer[]

        when:
        def result = solution.reassignedPriorities(input)

        then:
        result == [1,2,3,2] as Integer[]

    }
}

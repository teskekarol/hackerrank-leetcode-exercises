package leetcode

import leetcode.TwoSum
import spock.lang.Specification

class TwoSumSpec extends Specification {

    def solution = new TwoSum()

    def "should solve simple case"(){
        given:
        def input = [2,7,11,15] as int[]
        def target = 9

        when:
        def result=  solution.twoSum(input, target)

        then:
        result == [0,1] as int[]
    }

    def "should solve second case"(){
        given:
        def input = [3,2,4] as int[]
        def target = 6

        when:
        def result=  solution.twoSum(input, target)

        then:
        result == [1,2] as int[]
    }

}

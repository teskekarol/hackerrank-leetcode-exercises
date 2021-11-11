package leetcode

import leetcode.SortArrayByParity
import spock.lang.Specification

class SortArrayByParitySpec extends Specification {

    def "should solve test case"(){
        given:
        def input = [3,1,2,4] as int[]
        def expectedOutput = [2,4,3,1] as int[]

        when:
        def result = new SortArrayByParity().sortArrayByParity(input) as int[]

        then:
        expectedOutput.size() == result.size()
    }

}

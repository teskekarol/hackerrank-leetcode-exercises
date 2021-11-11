package leetcode

import leetcode.FinalPrices
import spock.lang.Specification

class FinalPricesSpec extends Specification {

    def solution = new FinalPrices()

    def "should solve simple case"() {
        given:
        def input = [8, 4, 6, 2, 3] as int[]
        def output = [4, 2, 4, 2, 3] as int[]

        when:
        def result = solution.finalPrices(input)

        then:
        output == result
    }

    def "should solve second case"() {
        given:
        def input = [1, 2, 3, 4, 5] as int[]
        def output = [1, 2, 3, 4, 5] as int[]

        when:
        def result = solution.finalPrices(input)

        then:
        output == result
    }

    def "should solve third case"() {
        given:
        def input = [10,1,1,6] as int[]
        def output = [9,0,1,6] as int[]

        when:
        def result = solution.finalPrices(input)

        then:
        output == result
    }

}

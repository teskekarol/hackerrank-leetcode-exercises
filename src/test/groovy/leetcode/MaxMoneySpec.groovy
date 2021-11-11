package leetcode

import leetcode.MaxMoney
import spock.lang.Specification

class MaxMoneySpec extends Specification {

    def "should solve simple valid case"() {
        given:
        def data = [2, 4, 1, 2, 7, 8] as int[]

        when:
        def result = new MaxMoney().maxCoins(data)

        then:
        result == 9
    }

    def "should solve second valid case"() {
        given:
        def data = [2, 4, 5] as int[]

        when:
        def result = new MaxMoney().maxCoins(data)

        then:
        result == 4
    }

    def "should solve third valid case"() {
        given:
        def data = [9, 8, 7, 6, 5, 1, 2, 3, 4] as int[]

        when:
        def result = new MaxMoney().maxCoins(data)

        then:
        result == 18
    }

}


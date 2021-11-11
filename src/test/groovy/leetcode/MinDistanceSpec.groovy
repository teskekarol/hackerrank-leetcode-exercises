package leetcode

import leetcode.MinDistance
import spock.lang.Specification

class MinDistanceSpec extends Specification {

    def "should solve simple case"() {
        given:
        def w1 = "horse"
        def w2 = "ros"

        when:
        def result = new MinDistance().minDistance(w1, w2)

        then:
        result == 3
    }

    def "should solve complex case"() {
        given:
        def w1 = "intention"
        def w2 = "execution"

        when:
        def result = new MinDistance().minDistance(w1, w2)

        then:
        result == 5
    }

}

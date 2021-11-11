package leetcode

import leetcode.ReverseInteger
import spock.lang.Specification
import spock.lang.Unroll

class ReverseIntegerSpec extends Specification {

    def solution = new ReverseInteger()

    @Unroll
    def "should solve cases"() {
        when:
        def result = solution.reverse(input)

        then:
        result == expectedOutput

        where:
        input      || expectedOutput
        123        || 321
        0          || 0
        -123       || -321
        120        || 21
        1 || 1
    }
}

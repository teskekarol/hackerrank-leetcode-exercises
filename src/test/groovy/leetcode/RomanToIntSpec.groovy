package leetcode

import leetcode.RomanToInt
import spock.lang.Specification
import spock.lang.Unroll

class RomanToIntSpec extends Specification {

    def solution = new RomanToInt()

    @Unroll
    def "should resolve roman to int"() {
        when:
        def result = solution.romanToInt(input)

        then:
        result == expectedOutput

        where:
        input   || expectedOutput
        "I"     || 1
        "II"    || 2
        "IV"    || 4
        "V"     || 5
        "LVIII" || 58
        "MCMXCIV" || 1994
        "XXVII" || 27
    }
}

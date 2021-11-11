package leetcode

import leetcode.IsPalindrome
import spock.lang.Specification
import spock.lang.Unroll

class IsPalindromeSpec extends Specification {

    def solution = new IsPalindrome()

    @Unroll
    def "should calculate palindrome"(){
        when:
        def result = solution.isPalindrome(input)

        then:
        result == expectedOutput

        where:
        input || expectedOutput
        121 || true
        -123 || false
        10 || false
        -101 || false
        11 || true
    }
}

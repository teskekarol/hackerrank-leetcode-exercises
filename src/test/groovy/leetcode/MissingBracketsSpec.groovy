package leetcode

import leetcode.MissingBrackets
import spock.lang.Specification

class MissingBracketsSpec extends Specification {

    def solution = new MissingBrackets()

    def "should just solve"(){
        given:
        def input = "(" * 6

        when:
        def result = solution.fillMissingBrackets(input)

        then:
        result == 0

    }

    def "should just"(){
        given:
        def input = "????"

        when:
        def result = solution.fillMissingBrackets(input)

        then:
        result == 1

    }

    def "should "(){
        given:
        def input = "(?]["

        when:
        def result = solution.fillMissingBrackets(input)

        then:
        result == 1

    }

    def "should 2"(){
        given:
        def input = "[(?][??["

        when:
        def result = solution.fillMissingBrackets(input)

        then:
        result == 2

    }

    def "should 3"(){
        given:
        def input = "(((?"

        when:
        def result = solution.fillMissingBrackets(input)

        then:
        result == 0
    }
}

package leetcode

import leetcode.JudgeCircle
import spock.lang.Specification

class JudgeCircleSpec extends Specification {

    def "should return simple case"(){
        given:
        def input = "LDRRLRUULR"

        when:
        def result = new JudgeCircle().judgeCircle(input)

        then:
        !result
    }

    def "should return second case"(){
        given:
        def input = "UD"

        when:
        def result = new JudgeCircle().judgeCircle(input)

        then:
        result
    }


}

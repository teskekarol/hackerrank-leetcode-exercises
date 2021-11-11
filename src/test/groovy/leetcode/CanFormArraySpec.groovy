package leetcode

import leetcode.CanFormArray
import spock.lang.Specification
import spock.lang.Unroll

class CanFormArraySpec extends Specification {

    def solution = new CanFormArray()

    @Unroll
    def "should solve #arr"() {
        when:
        def result = solution.canFormArray(arr as int[], pieces as int[][])

        then:
        result == expectedOutput

        where:
        arr             | pieces                || expectedOutput
        [85]            | [[85]]                || true
        [15, 88]        | [[88], [15]]          || true
        [49, 18, 16]    | [[16, 18, 49]]        || false
        [91, 4, 64, 78] | [[78], [4, 64], [91]] || true
        [1, 3, 5, 7]    | [[2, 4, 6, 8]]        || false

    }

    def "should solve tricky case"(){
        when:
        def result = solution.canFormArray([91, 4, 64, 78] as int[],  [[78], [4, 64], [91]] as int[][])

        then:
        result
    }
}

package leetcode

import leetcode.ContainerWithMostWater
import spock.lang.Specification

class ContainerWithMostWaterTest extends Specification {

    def subject = new ContainerWithMostWater()

    def "should solve example 1"() {
        given:
        def input = [1, 8, 6, 2, 5, 4, 8, 3, 7] as int[]

        when:
        def result = subject.maxArea(input)

        then:
        result == 49
    }

    def "should solve example 2"(){
        given:
        def input = [1,1] as int[]

        when:
        def result = subject.maxArea(input)

        then:
        result == 1
    }

    def "should solve example 3"(){
        given:
        def input = [4,3,2,1,4] as int[]

        when:
        def result = subject.maxArea(input)

        then:
        result == 16
    }

    def "should solve example 4"(){
        given:
        def input = [1,2,1] as int[]

        when:
        def result = subject.maxArea(input)

        then:
        result == 2
    }

}

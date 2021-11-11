import spock.lang.Specification

class SolutionsTest extends Specification {

    def "should solve q1"(){
        given:
        def input = [1,3,3,2,4]

        when:
        def result = SolutionClass.minDiff(input)

        then:
        result == 3
    }

    def "should solve q2"(){
        given:
        def input = "bab"

        when:
        def result = SolutionClass.shortestSubstring(input)

        then:
        result == 4

    }

    def "should solve q3"(){
        when:
        def result = SolutionClass.balancedOrNot(["<<<><><>"], [2])

        then:
        result == [0]
    }

    def "should solve q4"(){
        given:
        def input = [1, 3, 7, 4, 6, 4]

        when:
        def result = SolutionClass.collision(input, 3)

        then:
        result == 1
    }
}

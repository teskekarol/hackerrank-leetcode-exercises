import spock.lang.Specification

class MaximumWealthSpec extends Specification {

    def solution = new MaximumWealth()

    def "should solve simple case"(){
        given:
        def input = [[1,2,3],[3,2,1]] as int[][]

        when:
        def result = solution.maximumWealth(input)

        then:
        result == 6
    }

    def "should solve second case"(){
        given:
        def input = [[1,5],[7,3],[3,5]] as int[][]

        when:
        def result = solution.maximumWealth(input)

        then:
        result == 10
    }

    def "should solve third case"() {
        given:
        def input = [[2,8,7],[7,1,3],[1,9,5]] as int[][]

        when:
        def result = solution.maximumWealth(input)

        then:
        result == 17
    }

}

import spock.lang.Specification

class RunningSumSpec extends Specification {

    def solution = new RunningSum()

    def "should solve"() {
        given:
        def input = [1, 2, 3, 4]

        when:
        def result = solution.runningSum(input as int[])

        then:
        result == [1, 3, 6, 10] as int[]
    }
}

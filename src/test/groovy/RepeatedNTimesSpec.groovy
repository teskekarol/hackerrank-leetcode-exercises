import spock.lang.Specification
import spock.lang.Unroll

class RepeatedNTimesSpec extends Specification {

    def solution = new RepeatedNTimes()

    def "should solve example 1"() {
        given:
        def inputArr = [1, 2, 3, 3] as int[]

        when:
        def result = solution.repeatedNTimes(inputArr)

        then:
        result == 3
    }

    @Unroll
    def "should solve other cases"() {
        when:
        def result = solution.repeatedNTimes(input as int[])

        then:
        result == expectedResult

        where:
        input                    || expectedResult
        [2, 1, 2, 5, 3, 2]       || 2
        [5, 1, 5, 2, 5, 3, 5, 4] || 5
    }

}

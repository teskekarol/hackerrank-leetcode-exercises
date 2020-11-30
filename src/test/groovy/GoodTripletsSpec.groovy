import spock.lang.Specification

class GoodTripletsSpec extends Specification {

    def solution = new GoodTriplets()

    def "should solve first testcase"() {
        given:
        def arr = [3, 0, 1, 1, 9, 7] as int[]

        when:
        def result = solution.countGoodTriplets(arr, 7, 2, 3)

        then:
        result == 4
    }

    def "should solve second testcase"() {
        given:
        def arr = [1, 1, 2, 2, 3] as int[]

        when:
        def result = solution.countGoodTriplets(arr, 0, 0, 1)

        then:
        result == 0
    }

}

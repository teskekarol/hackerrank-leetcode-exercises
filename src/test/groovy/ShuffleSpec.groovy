import spock.lang.Specification

class ShuffleSpec extends Specification {

    def solution = new Shuffle()

    def "should solve simple case"(){
        given:
        def input = [2,5,1,3,4,7] as int[]
        def n = 3

        when:
        def result = solution.shuffle(input, n)

        then:
        result == [2,3,5,4,1,7] as int[]
    }

    def "should solve second case"(){
        given:
        def input = [1,2,3,4,4,3,2,1] as int[]
        def n = 4

        when:
        def result = solution.shuffle(input, n)

        then:
        result == [1,4,2,3,3,2,4,1] as int[]
    }

    def "should solve third case"(){
        given:
        def input = [1,1,2,2] as int[]
        def n = 2

        when:
        def result = solution.shuffle(input, n)

        then:
        result == [1,2,1,2] as int[]
    }

}

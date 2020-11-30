import spock.lang.Specification

class SelfDividingNumbersSpec extends Specification {

    def "should solve simple case"(){
        given:
        def left = 1
        def right = 22
        def output = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

        when:
        def result = new SelfDividingNumbers().selfDividingNumbers(left, right)

        then:
        output == result
    }

    def "should check if num is self divided"(){
        when:
        def result = new SelfDividingNumbers().a(128)

        then:
        result

    }

}

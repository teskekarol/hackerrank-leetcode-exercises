import spock.lang.Specification

class OutermostParentSpec extends Specification {

    def solution = new OutermostParent()

    def "should solve single case"(){
        given:
        def input = "(()())(())"

        when:
        def result = solution.removeOuterParentheses(input)

        then:
        result == "()()()"
    }
    def "should solve second case"(){
        given:
        def input = "(()())(())(()(()))"

        when:
        def result = solution.removeOuterParentheses(input)

        then:
        result == "()()()()(())"
    }

    def "should solve third case"(){
        given:
        def input = "()()"

        when:
        def result = solution.removeOuterParentheses(input)

        then:
        result == ""
    }

}

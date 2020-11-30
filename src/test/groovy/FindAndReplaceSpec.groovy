import spock.lang.Specification

class FindAndReplaceSpec extends Specification {

    def solution = new FindAndReplace()

    def "should run"(){
        given:
        def data = ["ccc", "abc","deq","mee","aqq","dkd"] as String[]

        when:
        def result = solution.findAndReplacePattern(data, "abb")

        then:
        result == ["mee", "aqq"]
    }

    def "should create mapping function"(){
        given:
        def pattern = "abb"
        def word = "bcc"

        when:
        def result = solution.resolve(pattern, word)

        then:
        result

    }

}

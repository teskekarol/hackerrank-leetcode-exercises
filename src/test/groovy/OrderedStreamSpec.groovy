import spock.lang.Specification

class OrderedStreamSpec extends Specification {

    def "should solve simple test"(){
        given:
        def stream = new OrderedStream(5)

        when:
        def result = stream.insert(3, "ccccc")

        then:
        result == []

        when:
        result = stream.insert(1, "aaaaa")

        then:
        result == ["aaaaa"]

        when:
        result = stream.insert(2, "bbbbb")

        then:
        result == ["bbbbb", "ccccc"]
    }

}

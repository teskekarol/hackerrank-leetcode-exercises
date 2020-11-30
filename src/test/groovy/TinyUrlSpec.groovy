import spock.lang.Specification

class TinyUrlSpec extends Specification {

    def "should encode and decode using hashcode"(){
        given:
        def sampleString = "some-string"

        when:
        def codec = new Codec()
        def url = codec.encode(sampleString)

        then:
        codec.decode(url) == sampleString
    }

}

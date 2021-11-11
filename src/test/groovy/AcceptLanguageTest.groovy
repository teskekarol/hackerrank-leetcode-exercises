import spock.lang.Specification
import spock.lang.Unroll

class AcceptLanguageTest extends Specification {

    def solution = new AcceptLanguage()

    def "should split header into tags"() {
        given:
        def input = "en-US, fr-CA, fr-FR"

        when:
        def result = solution.splitHeaderIntoTags(input)

        then:
        result == ["en-US", "fr-CA", "fr-FR"] as Set

    }

    def "should solve simple case"() {
        given:
        def header = "en-US, fr-CA, fr-FR"
        def supportedLangs = ["fr-FR", "en-US"] as Set<String>

        when:
        def result = solution.parseAcceptLanguage(header, supportedLangs)

        then:
        result == ["en-US", "fr-FR"]
    }

    @Unroll
    def "should solve more cases"() {
        when:
        def result = solution.parseAcceptLanguage(acceptHeaderInput, supportedLanguages as Set<String>)

        then:
        result == expectedResult

        where:
        acceptHeaderInput | supportedLanguages || expectedResult
        "en-US"           | []                 || []
        "en-UK"           | ["en-US"]          || []

    }

    //check if this is in correct order for sure

    @Unroll
    def "should solve part 2"() {
        when:
        def result = solution.parseAcceptLanguage(acceptHeaderInput, supportedLanguages as Set)

        then:
        result == expectedResult

        where:
        acceptHeaderInput | supportedLanguages          || expectedResult
        "en"              | ["en-US", "fr-CA", "fr-FR"] || ["en-US"]
        "fr"              | ["en-US", "fr-CA", "fr-FR"] || ["fr-CA", "fr-FR"]
        "fr-FR, fr"       | ["en-US", "fr-CA", "fr-FR"] || ["fr-FR", "fr-CA"]
    }

    @Unroll
    def "should solve part 3"() {
        when:
        def result = solution.parseAcceptLanguage(acceptHeaderInput, supportedLanguages as Set)

        then:
        result == expectedResult

        where:
        acceptHeaderInput | supportedLanguages          || expectedResult
        "en-US, *"        | ["en-US", "fr-CA", "fr-FR"] || ["en-US", "fr-CA", "fr-FR"]
        "fr-FR, fr, *"    | ["en-US", "fr-CA", "fr-FR"] || ["fr-FR", "fr-CA", "en-US"]
    }

}

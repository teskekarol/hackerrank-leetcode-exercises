import spock.lang.Specification

import java.time.Clock
import java.time.Instant
import java.time.ZoneId

class Day2Test extends Specification {

    def ratelimiter
    def api
    def clock = Mock(Clock)

    def setup() {
        ratelimiter = new RateLimiter(clock)
        api = new API(ratelimiter)
    }

    def "should allow 5 consecutive requests"(){
        given:
        def client = "client"

        when:
        (1..5).each {
            api.executeMethod(client)
        }

        then:
        noExceptionThrown()
    }

    def "should not allow 6 consecutive requests"(){
        given:
        def client = "client"

        when:
        (1..6).each {
            api.executeMethod(client)
        }

        then:
        thrown(RateLimitException)
    }

    def "should respect the timewindow"(){
        given:
        def client = "client"
        def now = Instant.now()
        def nowPlusThreeSeconds = now.plusSeconds(3)
        when:
        clock.instant() >> now
        (1..5).each {
            api.executeMethod(client)
        }
        clock.instant() >> nowPlusThreeSeconds
        (1..5).each {
            api.executeMethod(client)
        }

        then:
        noExceptionThrown()
    }
}

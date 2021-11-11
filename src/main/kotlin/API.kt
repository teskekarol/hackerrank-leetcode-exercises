import java.time.Clock
import java.time.Instant

class API(
    val ratelimiter: RateLimiter
) {

    fun executeMethod(customer: String): String {
        if (ratelimiter.shouldBeLimited(customer)) {
            throw RateLimitException()
        } else {
            return "results for $customer"
        }
    }
}

data class Request(
    val timestamp: Instant
)

class RateLimiter(
    val clock: Clock
) {

    //initiaze the list
    val storage: MutableMap<String, MutableList<Request>> = mutableMapOf()

    fun shouldBeLimited(customer: String): Boolean {
        val now = clock.instant()
        val lastPossibleTimestamp = now.minusSeconds(TIME_WINDOW)

        if (storage[customer] == null) {
            storage[customer] = mutableListOf()
        }

        storage[customer]!!.add(Request(now))

        val requestsWithinTimeWindow = storage[customer]
            ?.filter { request -> request.timestamp.isBefore(now) && request.timestamp.isAfter(lastPossibleTimestamp) }
            ?.count() ?: 0

        return requestsWithinTimeWindow <= MAX_REQUESTS_COUNT

    }

    companion object {
        val TIME_WINDOW = 2L
        val MAX_REQUESTS_COUNT = 5
    }

}

class RateLimitException : RuntimeException()

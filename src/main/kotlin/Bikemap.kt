import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.client.HttpClient
import io.ktor.client.call.receive
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import java.io.File

data class Ride(
    val features: List<RideFeatures>
)

data class RideFeatures(
    val geometry: RideGeometry
)

data class RideGeometry(
    val coordinates: List<List<Double>>
)

data class CoordinatePair(
    val x: Double,
    val y: Double
)

class Bikemap(
    private val objectMapper: ObjectMapper,
    val client: HttpClient
) {

    fun part1(): List<CoordinatePair> {
        val ride = objectMapper.readValue(readFile("resources/ride-simple.json"), Ride::class.java)

        return ride.features[0].geometry.coordinates.map { CoordinatePair(it[0], it[1]) }
    }

    suspend fun part2() {
        val requestBody = StaticMapRequest(
            center = MapCenter(47.579, -122.31),
            width = 400,
            height = 600,
            zoom = 13
        )
        val httpResponse: HttpResponse = client.post("https://stripe-bikemap.appspot.com/map.png") {
            contentType(ContentType.Application.Json)
            body = requestBody
        }
        val responseBodyBytes: ByteArray = httpResponse.receive()


        val file = File.createTempFile("map", ".png", File("C:\\projects\\own\\empty-kotlin-groovy\\src\\main\\resources"))
        file.writeBytes(responseBodyBytes)
    }

    private fun readFile(path: String): File = File(path)
}

suspend fun main() {
    val objectMapper = ObjectMapper()
        .registerKotlinModule()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    val httpClient = HttpClient() {
        install(JsonFeature) {
            serializer = JacksonSerializer()
        }
    }
    val bikemap = Bikemap(objectMapper, httpClient)
    bikemap.part2()
//    println(bikemap.part1().take(10))
}

data class StaticMapRequest(
    val center: MapCenter,
    val width: Int,
    val height: Int,
    val zoom: Int
)

data class MapCenter(
    val lat: Double,
    val lon: Double
)

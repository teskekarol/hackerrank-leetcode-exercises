package leetcode

class Codec {
    val hashes = mutableMapOf<Int, String>()

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        val hashCode = longUrl.hashCode()
        hashes[hashCode] = longUrl
        return "$hashCode"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        return hashes[Integer.valueOf(shortUrl)]!!
    }
}

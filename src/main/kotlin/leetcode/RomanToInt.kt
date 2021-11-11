package leetcode

class RomanToInt {
    fun romanToInt(s: String): Int {
        var result = 0
        val inputArray = s.split("").filter { it != "" }
        var i = 0
        while (i < inputArray.size) {
            val currentRoman = Roman.valueOf(inputArray[i])
            val nextRoman = inputArray.getOrNull(i + 1)?.let { Roman.valueOf(it) }

            if (shouldSubstract(RULES, currentRoman, nextRoman)) {
                result += nextRoman!!.worth - currentRoman.worth
                i += 2
            } else {
                result += currentRoman.worth
                i += 1
            }
        }

        return result
    }

    private fun shouldSubstract(weirdos: Map<Roman, Set<Roman>>, currentRoman: Roman, nextRoman: Roman?) =
        weirdos.containsKey(currentRoman)
            && nextRoman != null
            && weirdos.getOrDefault(currentRoman, emptySet()).contains(nextRoman)

    enum class Roman(val worth: Int) {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000)
    }

    companion object {
        val RULES = mapOf(
            Roman.I to setOf(Roman.V, Roman.X),
            Roman.X to setOf(Roman.L, Roman.C),
            Roman.C to setOf(Roman.D, Roman.M)
        )
    }
}

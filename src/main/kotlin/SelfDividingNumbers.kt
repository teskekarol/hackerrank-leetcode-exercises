class SelfDividingNumbers {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        return (left..right).asSequence()
            .filter { a(it) }
            .toList()
    }

    fun a(n: Int): Boolean {
        var k = n

        do {
            val rem = k % 10
            if (n % rem.toDouble() != 0.0) return false
            k /= 10
        } while (k > 1)

        return true
    }

}

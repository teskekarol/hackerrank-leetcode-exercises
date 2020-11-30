class OrderedStream(n: Int) {
    private val array = kotlin.arrayOfNulls<String>(n)
    var pointer = 0
    private val maxPointer = n

    fun insert(id: Int, value: String): List<String> {
        array[id - 1] = value
        var result = mutableListOf<String>()
        while (array[pointer] != null) {
            result.add(array[pointer]!!)
            pointer++
            if(pointer == maxPointer) break
        }
        return result
    }

}

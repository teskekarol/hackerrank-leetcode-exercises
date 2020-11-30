class DiStringMatch {
    fun diStringMatch(S: String): IntArray {
        var bottom = 0
        var top = S.length
        val result = IntArray(S.length+1)

        S.forEachIndexed { index, c ->
            if(c == 'D'){
                result[index] = top
                top--
            } else {
                result[index] = bottom
                bottom++
            }
        }
        result[S.length] = bottom

        return result
    }
}

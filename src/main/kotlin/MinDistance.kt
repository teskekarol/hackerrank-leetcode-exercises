class MinDistance {
    fun minDistance(word1: String, word2: String): Int {
        //Levenshtein algorithm
        val word1length = word1.length
        val word2length = word2.length

        val dpArray = Array(word1length+1) { IntArray(word2length+1) }
        (0..word1length).forEach { dpArray[it][0] = it }
        (0..word2length).forEach { dpArray[0][it] = it }


        word1.indices.forEach { word1index ->
            word2.indices.forEach { word2index ->
                dpArray[word1index+1][word2index+1] = if(word1[word1index] == word2[word2index]) {
                    dpArray[word1index][word2index]
                } else {
                    minOf(dpArray[word1index][word2index], dpArray[word1index+1][word2index], dpArray[word1index][word2index+1]) + 1
                }
            }
        }


        return dpArray[word1length][word2length]
    }
}

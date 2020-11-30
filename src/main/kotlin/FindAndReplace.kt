class FindAndReplace {
    fun findAndReplacePattern(words: Array<String>, pattern: String) = words.filter { resolve(pattern, it) }

    fun resolve(pattern: String, testedWord: String): Boolean {
        val functions: MutableMap<Char, Char> = mutableMapOf()
        val values = mutableSetOf<Char>()

        pattern.forEachIndexed { index, charInPattern ->
            val function = functions[charInPattern]
            val testedWordCharAtGivenIndex = testedWord[index]

            if (function == null) {
                if(!values.contains(testedWordCharAtGivenIndex)){
                    functions[charInPattern] = testedWordCharAtGivenIndex
                    values.add(testedWordCharAtGivenIndex)
                } else {
                    return false
                }
            } else {
                if (testedWordCharAtGivenIndex != function) {
                    return false
                }
            }
        }
        return true
    }

}

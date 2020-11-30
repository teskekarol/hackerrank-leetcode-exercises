class OutermostParent {
    fun removeOuterParentheses(input: String): String {
        var counter = 0
        val result = StringBuffer("")

        for (char in input) {
            if (char == '(') {
                if (counter != 0) {
                    result.append(char)
                }
                counter++
            } else {
                if (counter != 1) {
                    result.append(char)
                }
                counter--
            }
        }

        return result.toString()
    }
}

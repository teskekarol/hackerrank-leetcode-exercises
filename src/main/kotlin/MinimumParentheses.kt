class MinimumParentheses {
    fun minAddToMakeValid(input: String): Int {
        var closed = 0
        var opened = 0

       input.toCharArray().forEach {char ->
            when {
                char == '(' -> {
                    opened++
                }
                char == ')' && opened == 0 -> closed++
                char == ')' && opened != 0 -> opened--
            }
        }

        return closed+opened
    }


    fun iterate(input: String): String {
        val range = IntRange(input.indices.first, input.indices.last -1)
        for(i in range){
            if(input[i] == '(' && input[i+1] == ')'){
                return input.removeRange(i,i+2)
            }
        }
        return input
    }
}

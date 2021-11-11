package leetcode

class JudgeCircle {
    fun judgeCircle(moves: String): Boolean {
        var leftRight = 0
        var upDown = 0
        for(i in 0 until moves.length){
            when(moves[i]){
                'D' -> upDown++
                'U' -> upDown--
                'L' -> leftRight--
                'R' -> leftRight++
            }
        }
        return leftRight == 0 && upDown == 0
    }
}

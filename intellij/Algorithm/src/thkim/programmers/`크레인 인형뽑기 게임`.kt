package thkim.programmers

fun main() {

}

class `크레인 인형뽑기 게임` {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0

        val stack = ArrayDeque<Int>()

        moves.forEach { p ->
            val point = p - 1

            loop@ for (i in board.indices) {
                if (board[i][point] == 0) continue@loop

                val takenData = board[i][point]
                board[i][point] = 0

                stack.firstOrNull()?.let { stackData ->
                    if (stackData != takenData) {
                        stack.addFirst(takenData)
                    } else {
                        stack.removeFirst()
                        answer += 2
                    }
                } ?: stack.addFirst(takenData)

                break@loop
            }
        }

        return answer
    }
}


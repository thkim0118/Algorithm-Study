package thkim.programmers.lotto

fun main() {

}

class Lotto {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        lottos.sort()
        win_nums.sort()

        var zeroCount = 0
        var correctCount = 0

        lottos.forEach {
            if (it == 0) zeroCount++
            else win_nums.forEach { winNum ->
                if (it == winNum) correctCount++
            }
        }

        return intArrayOf(getRank(correctCount + zeroCount), getRank(correctCount))
    }

    fun getRank(count: Int): Int {
        return when (count) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}
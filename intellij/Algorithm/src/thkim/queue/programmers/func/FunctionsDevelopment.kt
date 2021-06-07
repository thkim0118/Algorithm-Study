package thkim.queue.programmers.func

import kotlin.math.ceil

@kotlin.ExperimentalStdlibApi
class FunctionsDevelopment {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val q = ArrayDeque<Int>()
        var total = 0

        speeds.forEachIndexed { index, speed ->
            val day = ceil((100 - progresses[index]) / speed.toDouble())

            val count = q.removeLastOrNull()
            if (total >= day) { // 7 3
                q.addFirst(count?.plus(1) ?: 1)
            } else {
                total = day.toInt()
                count?.let { answer.add(it) }
                q.addFirst(1)
            }
        }

        q.removeLastOrNull()?.let { answer.add(it) }

        return answer.toIntArray()
    }
}
package thkim.week1003

fun main() {
    val answer = `K번째수`().solution(
        intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(
            intArrayOf(2, 5, 3),
            intArrayOf(4, 4, 1),
            intArrayOf(1, 7, 3)
        )
    )

    answer.forEach { print("$it ") }
    println()

}

class `K번째수` {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)

        commands.forEachIndexed { index, arr ->
            val i = arr[0]
            val j = arr[1]
            val k = arr[2]
            answer[index] = array.slice((i - 1) until j).sorted()[k - 1]
        }

        return answer
    }

}
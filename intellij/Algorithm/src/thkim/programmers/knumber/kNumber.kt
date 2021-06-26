package thkim.programmers.knumber

class kNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        commands.forEach {
            answer.add(array.sliceArray((it[0] - 1) until it[1]).sorted()[it[2] - 1])
        }
        return answer.toIntArray()
    }

    fun _solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }.toIntArray()
    }
}
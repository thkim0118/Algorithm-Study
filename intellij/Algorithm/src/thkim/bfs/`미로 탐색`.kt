package thkim.bfs

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

// TODO : 시간 초과.
fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val matrix = Array(N) { IntArray(M) }
        .map {
            readLine().map { Character.getNumericValue(it) }.toIntArray()
        }

    val count = Array(N) { IntArray(M) { 1 } }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    var minimum = Int.MAX_VALUE

    fun dfs(x: Int, y: Int) {
        val queue = ArrayDeque<Pair<Int, Int>>()

        queue.add(x to y)

        while (queue.isNotEmpty()) {
            val data = queue.removeLast()

            loop@ for (i in 0 until 4) { // 0: Down, 1: Up, 2: Right, 3: Left
                val curCount = count[data.first][data.second]

                val nextX = data.first + dx[i]
                val nextY = data.second + dy[i]

                if (nextX !in 0 until N || nextY !in 0 until M) continue@loop

                if (count[nextX][nextY] < curCount && count[nextX][nextY] != 1) {
                    continue@loop
                }

                if (matrix[nextX][nextY] != 0) {
                    count[nextX][nextY] = curCount + 1

                    if (nextX == (N - 1) && nextY == (M - 1)) {
                        minimum = min(minimum, count[nextX][nextY])
                    }

                    queue.add(nextX to nextY)
                }
            }
        }
    }

    dfs(0, 0)

    println(minimum)
}
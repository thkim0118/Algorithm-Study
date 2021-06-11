package thkim.queue.hackerrank

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.array


/*
 * Complete the 'minimumMoves' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING_ARRAY grid
 *  2. INTEGER startX
 *  3. INTEGER startY
 *  4. INTEGER goalX
 *  5. INTEGER goalY
 */



fun minimumMoves(grid: Array<String>, startX: Int, startY: Int, goalX: Int, goalY: Int): Int {
    // Write your code here
    var count = 0

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addFirst(startX to startY)

    fun bfs(q: ArrayDeque<Pair<Int, Int>>): Int {
        val distance: MutableList<IntArray> = mutableListOf()

        for (i in grid.indices) {
            val temp = grid[i].trim().toCharArray()
            for (j in temp.indices) {
                distance[i][j] = Int.MAX_VALUE
            }
        }

        distance[startX][startY] = 0

        while (q.isNotEmpty()) {
            val de = q.removeLast()
            val i: Int = de.first
            val j: Int = de.second
            val curD: Int = distance[i][j] + 1

            //Cell s = pos.poll();
            //int si = s.i;
            //int sj = s.j;
            for (k in i + 1 until grid.size) {
                if (grid[k][j] == 'X') {
                    break
                }
                if (distance[k][j] > curD) {
                    distance[k][j] = curD
                    q.addFirst(k to j)
                }
            }

            for (k in i - 1 downTo 0) {
                if (grid[k][j] == 'X') {
                    break
                }
                if (distance[k][j] > curD) {
                    distance[k][j] = curD
                    q.addFirst(k to j)
                }
            }

            for (k in j + 1 until grid[0].length) {
                if (grid[i][k] == 'X') {
                    break
                }
                if (distance[i][k] > curD) {
                    distance[i][k] = curD
                    q.addFirst(i to k)
                }
            }

            for (k in j - 1 downTo 0) {
                if (grid[i][k] == 'X') {
                    break
                }
                if (distance[i][k] > curD) {
                    distance[i][k] = curD
                    q.addFirst(i to k)
                }
            }
        }

        return distance[goalX][goalY]
    }

    return bfs(queue)
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

//    val grid = Array<String>(n, { "" })
//    for (i in 0 until n) {
//        val gridItem = readLine()!!
//        grid[i] = gridItem
//    }
    val grid = Array<String>(3, { "" })
    grid[0] = ".X."
    grid[1] = ".X."
    grid[2] = "..."

    val result = minimumMoves(grid, 0, 0, 0, 2)

    println(result)
}
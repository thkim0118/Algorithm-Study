package thkim.week1017

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var testCaseCount = readLine().toInt()
    val answer = StringBuilder()

    while (testCaseCount-- > 0) {
        findPath(this, answer)
    }

    println(answer.toString())
}

private fun findPath(reader: BufferedReader, answer: StringBuilder) {
    val convenienceCount = reader.readLine().toInt()
    val posArr = ArrayList<Pair<Int, Int>>(convenienceCount + 2)
    val graph = ArrayList<ArrayList<Int>>()

    // initialize
    for (i in 0 until convenienceCount + 2) {
        val position = reader.readLine().split(' ')
        posArr.add(position[0].toInt() to position[1].toInt())
        graph.add(arrayListOf())
    }

    // graph 만들기
    for (i in 0 until convenienceCount + 2) {
        for (j in i + 1 until convenienceCount + 2) {
            if (getManhattanDistance(posArr[i], posArr[j]) <= 1000) {
                graph[i].add(j)
                graph[j].add(i)
            }
        }
    }

    answer.append(if (bfs(graph, convenienceCount)) "happy\n" else "sad\n")
}

private fun getManhattanDistance(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Int =
    abs(p1.first - p2.first) + abs(p1.second - p2.second)

private fun bfs(graph: ArrayList<ArrayList<Int>>, convenienceCount: Int): Boolean {
    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(convenienceCount + 2)

    queue.addFirst(0)
    visited[0] = true

    while (queue.isNotEmpty()) {
        val curPos = queue.removeLast()

        // graph 의 마지막에 도달하면 페스티벌 도착
        if (curPos == convenienceCount + 1) return true

        for (next in graph[curPos]) {
            if (visited[next]) continue

            visited[next] = true
            queue.addFirst(next)
        }
    }

    return false
}
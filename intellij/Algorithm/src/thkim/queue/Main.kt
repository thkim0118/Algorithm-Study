package thkim.queue

import thkim.queue.leetcode.task.TaskScheduler
import thkim.queue.programmers.func.FunctionsDevelopment

fun main() {
//    testFunctions()
    testTaskScheduler()
}

@OptIn(ExperimentalStdlibApi::class)
fun testFunctions() {
    val func = FunctionsDevelopment()
// [2,2,1,2] [1,1,1,1] -> [2,2]
    println("기능 개발")
    println("1.")
    func.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
    println("2.")
    func.solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1))
    println("3.")
    func.solution(intArrayOf(40, 93, 30, 55, 60, 65), intArrayOf(60, 1, 30, 5, 10, 7))
    println("4.")
    func.solution(intArrayOf(93, 30, 55, 60, 40, 65), intArrayOf(1, 30, 5, 10, 60, 7))
    println("5.")
    func.solution(intArrayOf(99, 99, 99, 99, 99), intArrayOf(3, 3, 3, 3, 3))
    println("--------------------------")
}

fun testTaskScheduler() {
    val task = TaskScheduler()

    println("Task Scheduler")
//    task.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2)
    task.leastInterval(charArrayOf('A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'), 2)
}
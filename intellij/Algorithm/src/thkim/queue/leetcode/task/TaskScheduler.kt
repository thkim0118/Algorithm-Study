package thkim.queue.leetcode.task

import java.util.*

class TaskScheduler {

    fun leastInterval(tasks: CharArray, n: Int): Int {
        val queue = PriorityQueue<Int>(Collections.reverseOrder())

        val countMap = tasks.asSequence().groupingBy { it }.eachCount()
        queue.addAll(countMap.values)

        var count = 0

        while (queue.isNotEmpty()) {
            val list = mutableListOf<Int>()

            for (i in 0 until (n + 1)) {
                if (queue.isEmpty()) break
                val data = queue.poll()
                list.add(data - 1)
            }
            queue.addAll(list.filter { it != 0 })

            count += if (queue.isNotEmpty()) {
                n + 1
            } else {
                list.size
            }
        }

        println("count -> $count")

        return count
    }
}
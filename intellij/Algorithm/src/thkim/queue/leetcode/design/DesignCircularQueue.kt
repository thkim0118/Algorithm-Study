package thkim.queue.leetcode.design

import kotlin.math.abs

fun main() {

    val cq1 = MyCircularQueue(3)
    with(cq1) {
        println(enQueue(1))
        println(enQueue(2))
        println(enQueue(3))
        println(enQueue(4))
        println(Rear())
        println(isFull())
        println(deQueue())
        println(enQueue(4))
        println(Rear())
        println("++++++++++++++++++++++++++++++")
    }

//    val cq = MyCircularQueue(6)
//    with(cq) {
//        println("enQueue------------------------")
//        println(enQueue(6))
//        println("Rear------------------------")
//        println(Rear())
//        println("Rear------------------------")
//        println(Rear())
//        println("deQueue------------------------")
//        println(deQueue())
//        println("enQueue------------------------")
//        println(enQueue(5))
//        println("Rear------------------------")
//        println(Rear())
//        println("deQueue------------------------")
//        println(deQueue())
//        println("Front------------------------")
//        println(Front())
//        println("deQueue------------------------")
//        println(deQueue())
//        println("deQueue------------------------")
//        println(deQueue())
//        println("deQueue------------------------")
//        println(deQueue())
//        println("------------------------")
//    }

//    val cq = MyCircularQueue(8)
//    with(cq) {
//        enQueue(3)
//        enQueue(9)
//        enQueue(5)
//        enQueue(0)
//        deQueue()
//        deQueue()
//        isEmpty()
//        isEmpty()
//        Rear()
//        Rear()
//        deQueue()
//    }
}

class MyCircularQueue(k: Int) {

    private val buffer: Array<Int?> = arrayOfNulls(k)

    private var frontPos = 0
    private var rearPos = 0

    fun enQueue(value: Int): Boolean {
        if (buffer[rearPos] != null) {
            return false
        }

        buffer[rearPos] = value

        rearPos = (rearPos + 1) % buffer.size

        return true
    }

    fun deQueue(): Boolean {
        if (buffer[frontPos] == null || buffer.isEmpty()) return false

        buffer[frontPos] = null

        frontPos = (frontPos + 1) % buffer.size

        return true
    }

    fun Front(): Int {
        return buffer[frontPos] ?: -1
    }

    fun Rear(): Int {
        return buffer[curRearPos()] ?: -1
    }

    fun isEmpty(): Boolean {
        return buffer[frontPos] == null && buffer[curRearPos()] == null
    }

    fun isFull(): Boolean {
        return (abs(frontPos - rearPos) == 1 && buffer[rearPos] != null) || (frontPos == rearPos && buffer[rearPos] != null)
    }

    fun curRearPos(): Int = if (rearPos - 1 < 0) buffer.size - 1 else rearPos - 1
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */
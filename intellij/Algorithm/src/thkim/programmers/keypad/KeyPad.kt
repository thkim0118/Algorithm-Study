package thkim.programmers.keypad

import kotlin.math.abs

fun main() {
    val keyPad = KeyPad()

//    keyPad.solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right")
    keyPad.solution(intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2), "left")
}

class KeyPad {
    fun solution(numbers: IntArray, hand: String): String {
        val answer = StringBuilder()

        val leftPos = IntArray(2) // x, y
        leftPos[0] = 0
        leftPos[1] = 3
        val rightPos = IntArray(2)
        rightPos[0] = 2
        rightPos[1] = 3

        numbers.forEach {
            when {
                // Left
                it % 3 == 1 -> appendData(leftPos, 0, it / 3, "L", answer)

                // Right
                it != 0 && it % 3 == 0 -> appendData(rightPos, 2, (it / 3) - 1, "R", answer)

                else -> {
                    val x = 1
                    val y = if (it == 0) 3 else it / 3

                    val lDistance = abs(leftPos[0] - x) + abs(leftPos[1] - y)
                    val rDistance = abs(rightPos[0] - x) + abs(rightPos[1] - y)

                    if (lDistance > rDistance) {
                        appendData(rightPos, x, y, "R", answer)
                    } else if (rDistance > lDistance) {
                        appendData(leftPos, x, y, "L", answer)
                    } else {
                        if (hand == "right") appendData(rightPos, x, y, "R", answer)
                        else appendData(leftPos, x, y, "L", answer)
                    }
                }
            }
        }

        println("answer.toString() -> ${answer.toString()}")
        return answer.toString()
    }

    fun appendData(pos: IntArray, x: Int, y: Int, hand: String, answer: StringBuilder) {
        pos[0] = x
        pos[1] = y
        answer.append(hand)
    }
}
package thkim.programmers.internal

fun main() {

}

class Internal {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.mapIndexed { index, i -> i * b[index] }.sum()
    }
}
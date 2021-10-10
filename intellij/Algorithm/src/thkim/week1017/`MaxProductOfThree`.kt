package thkim.week1017

fun main() {
    val answer1 = `MaxProductOfThree`().solution(
        intArrayOf(-3, 1, 2, -2, 5, 6)
    )

    println(answer1)
}

class `MaxProductOfThree` {
    fun solution(A: IntArray): Int {
        val arr = A.sorted()

        val lastIndex = arr.size - 1
        val group1 = arr[lastIndex] * arr[lastIndex - 1] * arr[lastIndex - 2]
        val group2 = arr[lastIndex] * arr[0] * arr[1]

        return if (group1 > group2) group1 else group2
    }
}
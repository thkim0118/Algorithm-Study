package thkim.another

fun main() {

    val s = Solution()

    s.solution(intArrayOf(1, 2, 3))
}

class Solution {
    fun solution(arr: IntArray): Int {

        fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

        var answer = arr[0]

        for (i in 1 until arr.size) {
            answer = answer * arr[i] / gcd(answer, arr[i])
        }

        return answer
    }
}
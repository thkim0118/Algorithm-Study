package thkim.programmers.minority

fun main() {

    Minority().solution(intArrayOf(1, 2, 3, 4))
}

class Minority {
    fun solution(nums: IntArray): Int {
        var answer = 0

        fun combination(
            el: List<Int>,
            ck: Array<Boolean>,
            start: Int,
            target: Int
        ) {
            if (target == 0) {
                println(el)
                if (isPrime(el.filterIndexed { index, t -> ck[index] }.sum())) answer++
            } else {
                for (i in start until el.size) {
                    ck[i] = true
                    combination(el, ck, i + 1, target - 1)
                    ck[i] = false
                }
            }
        }

        combination(nums.toList(), Array(nums.size) { false }, 0, 3)

        return answer
    }

    fun isPrime(candidate: Int): Boolean {
        println("can : $candidate")
        if (candidate == 1 || candidate == 0) return false
        for (i in 2..(candidate / 2)) {
            if (candidate % i == 0) return false
        }

        return true
    }
}
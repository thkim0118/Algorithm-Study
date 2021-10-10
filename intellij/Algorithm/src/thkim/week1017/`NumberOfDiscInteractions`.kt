package thkim.week1017

fun main() {
    val answer1 = `NumberOfDiscInteractions`().solution2(
        intArrayOf(1, 5, 2, 1, 4, 0)
    )

    println(answer1)

    val answer2 = `NumberOfDiscInteractions`().solution2(
        intArrayOf(1, 1, 1)
    )

    println(answer2)
}

class `NumberOfDiscInteractions` {

    fun solution1(A: IntArray): Int {
        val leftArr = LongArray(A.size)
        val rightArr = LongArray(A.size)

        for (i in A.indices) {
            leftArr[i] = i - A[i].toLong() // center - A[i]
            rightArr[i] = i + A[i].toLong() // center + A[i]
        }

        leftArr.sort()
        rightArr.sort()

        var interactions = 0
        var j = 0

        for (i in A.indices) {
            while (j < A.size && rightArr[i] >= leftArr[j]) {
                interactions += j // rightArr[i] 보다 작거나 같은 값을 가지는 leftArr 의 개수
                interactions -= i
                j += 1
            }
        }

        if (interactions > 10_000_000) return -1

        return interactions
    }

    // https://lipcoder.tistory.com/entry/NumberOfDiscIntersections-Codility
    fun solution2(A: IntArray): Int {
        var result = 0

        val leftArr = LongArray(A.size)
        val rightArr = LongArray(A.size)

        for (i in A.indices) {
            leftArr[i] = i - A[i].toLong() // center - A[i]
            rightArr[i] = i + A[i].toLong() // center + A[i]
        }

        leftArr.sort()
        rightArr.sort()

        var discCount = 0 // 교차되는 디스크의 수
        var currentRightIndex = 0 // 현제 right 의 위치

        for (i in leftArr) {
            // 범위를 벗어난 디스크는 제외
            while (i > rightArr[currentRightIndex]) {
                discCount -= 1
                currentRightIndex += 1
            }

            result += discCount
            discCount += 1
            if (result > 10_000_000) return -1
        }

        return result
    }
}
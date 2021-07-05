package thkim.programmers

class `모의고사` {
    fun solution(answers: IntArray): IntArray {
        val one = arrayOf(1, 2, 3, 4, 5)
        val two = arrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val three = arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val map = HashMap<Int, Int>(3)

        answers.forEachIndexed { index, i ->
            if (one[index % one.size] == i) map[1] = map.getOrDefault(1, 0) + 1
            if (two[index % two.size] == i) map[2] = map.getOrDefault(2, 0) + 1
            if (three[index % three.size] == i) map[3] = map.getOrDefault(3, 0) + 1
        }

        var max = -1
        val answer = ArrayList<Int>()

        map.forEach { (key, value) ->
            if (value > max) {
                answer.clear()
                answer.add(key)
                max = value
            } else if (value == max) {
                answer.add(key)
            }
        }

        return answer.toIntArray()
    }
}
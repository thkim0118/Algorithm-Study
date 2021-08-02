package thkim.programmers.weeklychallenge

fun main() {
    val s = `부족한 금액 계산하기`()
    s.solution(3, 20, 4)
}

class `부족한 금액 계산하기` {

    fun solution(price: Int, money: Int, count: Int): Long {
        val answer = ((2..count).fold(price.toLong()) { total, num -> total + (num * price) }.toLong() - money.toLong())

        return if (answer > 0) answer else 0L
    }

}
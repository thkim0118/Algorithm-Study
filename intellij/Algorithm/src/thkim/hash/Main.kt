package thkim.hash

fun main() {

    println("--------------------------")
    testHashMapLevel1()
}

fun testHashMapLevel1() {
    val lv1 = HashMapLevel1()

    println("1. Hash Level 1")
    println(lv1.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
    println(lv1.solution(arrayOf("aaa", "bbb", "ccc"), arrayOf("ccc", "bbb")))
    println("--------------------------")
}
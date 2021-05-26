package thkim.hash

fun main() {

    println("--------------------------")
    testHashMapLevel1()
    testHashMapLevel2()
}

fun testHashMapLevel1() {
    val lv1 = HashMapLevel1()

    println("1. Hash Level 1")
    println(lv1.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
    println(lv1.solution(arrayOf("aaa", "bbb", "ccc"), arrayOf("ccc", "bbb")))
    println("--------------------------")
}

fun testHashMapLevel2() {
    val lv2 = HashMapLevel2()

    println("2. Hash Level 1")
    println(lv2.solution(arrayOf("119", "97674223", "1195524421")))
    println(lv2.solution(arrayOf("123", "456", "789")))
    println("--------------------------")
}
package thkim.hash

import thkim.hash.album.HashLevel3Genres
import thkim.hash.marathon.HashMapLevel1
import thkim.hash.marathon.HashLevel1MarathonKt
import thkim.hash.phone.HashMapLevel2

fun main() {
    println("--------------------------")
//    testHashMapLevel1()
//    testHashMapLevel2()

//    testHashMapLevel3Genres()

    testHashMarathonKt()
}

fun testHashMapLevel1() {
    val lv1 = HashMapLevel1()

    println("1. Hash Level 1")
    println(lv1.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
    println(lv1.solution(arrayOf("aaa", "bbb", "ccc"), arrayOf("ccc", "bbb")))
    println("--------------------------")
}

fun testHashMarathonKt() {
    val lv1 = HashLevel1MarathonKt()

    println("1. Hash Level 1 kotlin")
    println(lv1.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
    println(lv1.solution(arrayOf("aaa", "bbb", "ccc"), arrayOf("ccc", "bbb")))
    println("--------------------------")
}

fun testHashMapLevel2() {
    val lv2 = HashMapLevel2()

    println("2. Hash Level 1")
    println(lv2.solution___(arrayOf("119", "97674223", "1195524421")))
//    println(lv2.solution__(arrayOf("119", "97674223", "1195524421")))
//    println(lv2.solution__(arrayOf("1195524421", "119", "97674223")))
//    println(lv2.solution(arrayOf("123", "456", "789")))
    println("--------------------------")
}

fun testHashMapLevel3Genres() {
    val lv3 = HashLevel3Genres()

    println("3. Hash Level 2 Genres")
    lv3.solution(
        arrayOf("classic", "pop", "classic", "classic", "pop"),
        intArrayOf(500, 600, 150, 800, 2500)
    )
//    println(lv2.solution__(arrayOf("119", "97674223", "1195524421")))
//    println(lv2.solution__(arrayOf("1195524421", "119", "97674223")))
//    println(lv2.solution(arrayOf("123", "456", "789")))
    println("--------------------------")
}
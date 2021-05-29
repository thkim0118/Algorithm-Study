package thkim.hash

fun main() {
    println("--------------------------")
//    testHashMapLevel1()
//    testHashMapLevel2()

    testHashMapLevel3Genres()
}

fun testHashMapLevel1() {
    val lv1 = thkim.hash.HashMapLevel1()

    println("1. Hash Level 1")
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
package thkim.stack

fun main() {
    testMakeTheStringGreat()
}

fun testMakeTheStringGreat() {
    val stringGreat = MakeTheStringGreat()

    println("Make The String Great")
    println(stringGreat.makeGood("leEeetcode"))
    println(stringGreat.makeGood("abBAcC"))
    println("--------------------------")
}
package thkim.stack

import thkim.stack.great.MakeTheStringGreat
import thkim.stack.parenthesis.ValidParentheses

fun main() {
//    testMakeTheStringGreat()
    testValidParentheses()
}

fun testMakeTheStringGreat() {
    val stringGreat = MakeTheStringGreat()

    println("Make The String Great")
    println(stringGreat.makeGood("leEeetcode"))
    println(stringGreat.makeGood("abBAcC"))
    println("--------------------------")
}

fun testValidParentheses() {
    val parentheses = ValidParentheses()

    println("Make The String Great")
    println(parentheses.isValid("()[]{}")) // true
    println(parentheses.isValid("([)]")) // false
    println(parentheses.isValid("{[]}")) // true
    println(parentheses.isValid("({[)")) // false
    println("--------------------------")

}
package thkim.stack

import thkim.stack.element.NextGreaterElement2
import thkim.stack.great.MakeTheStringGreat
import thkim.stack.parenthesis.ValidParentheses

fun main() {
//    testMakeTheStringGreat()
//    testValidParentheses()
    testNextGreaterElement2()
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

fun testNextGreaterElement2() {
    val element2 = NextGreaterElement2()

    println("Make The String Great")
    println(element2.nextGreaterElements1(intArrayOf(5, 1, 2, 0, 4))) // true
    println("--------------------------")

}
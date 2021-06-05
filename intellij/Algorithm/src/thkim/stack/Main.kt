package thkim.stack

import thkim.stack.element.NextGreaterElement2
import thkim.stack.great.MakeTheStringGreat
import thkim.stack.parenthesis.ValidParentheses

fun main() {
//    testMakeTheStringGreat()
//    testValidParentheses()
    testNextGreaterElement()
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

fun testNextGreaterElement() {
    val element2 = NextGreaterElement2()

    println("Next Greater Element")
    println(element2.nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)))
    println(element2.nextGreaterElements(intArrayOf(5, 1, 2, 0, 4)))
    println("--------------------------")
}
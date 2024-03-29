package thkim.stack

import thkim.stack.element.NextGreaterElement
import thkim.stack.element.NextGreaterElement2
import thkim.stack.great.MakeTheStringGreat
import thkim.stack.great.MakeTheStringGreat2
import thkim.stack.node.NextGreaterNodeInLinkedList
import thkim.stack.parenthesis.ValidParentheses
import thkim.stack.parenthesis.ValidParentheses2

fun main() {
//    testMakeTheStringGreat()
//    testValidParentheses()
//    testNextGreaterElement()
//    testNextGreaterNode()

//    testMakeTheStringGreat2()
//    testValidParentheses2()
    testNExtGreaterElement2()
}

fun testMakeTheStringGreat2() {
    val stringGreat = MakeTheStringGreat2()

    println("Make The String Great")
    println(stringGreat.makeGood("leEeetcode"))
    println(stringGreat.makeGood("abBAcC"))
    println("--------------------------")
}

fun testNextGreaterNode() {
    val nodeNode = NextGreaterNodeInLinkedList()

    println("Next Greater Node")
    println(nodeNode.nextLargerNodes(NextGreaterNodeInLinkedList.ListNode(5)))
    println("--------------------------")
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

fun testValidParentheses2() {
    val parentheses = ValidParentheses2()

    println("Make The String Great2")
    println(parentheses.isValid("()[]{}")) // true
//    println(parentheses.isValid("([)]")) // false
//    println(parentheses.isValid("{[]}")) // true
//    println(parentheses.isValid("({[)")) // false
    println("--------------------------")
}

fun testNextGreaterElement() {
    val element2 = NextGreaterElement()

    println("Next Greater Element")
    println(element2.nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)))
    println(element2.nextGreaterElements(intArrayOf(5, 1, 2, 0, 4)))
    println("--------------------------")
}

fun testNExtGreaterElement2() {
    val element2 = NextGreaterElement2()

    println("Next Greater Element")
    println(element2.nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)))
//    println(element2.nextGreaterElements(intArrayOf(5, 1, 2, 0, 4)))
    println("--------------------------")
}
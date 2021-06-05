package thkim.stack.node

import java.util.*

class NextGreaterNodeInLinkedList {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    fun nextLargerNodes(head: ListNode): IntArray {
        val list = arrayListOf<Int>()
        var node: ListNode? = head

        // ListNode 의 값을 arrayList 에 넣는다.
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }

        // Debugging
        list.clear()
        list.add(2)
        list.add(7)
        list.add(4)
        list.add(3)
        list.add(5)

        val result = IntArray(list.size)
        val stack = Stack<Int>()

        for (i in list.indices) {
            println("i -> $i")
            while (stack.isNotEmpty() && list[stack.peek()] < list[i]) {
                println("result[${stack.peek()}] = ${list[i]}")
                result[stack.pop()] = list[i]
            }

            stack.push(i)
        }

        return result
    }
}
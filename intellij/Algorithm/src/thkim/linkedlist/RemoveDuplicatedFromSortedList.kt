package thkim.linkedlist

fun main() {

}

// recursion solution
fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head == null) {
        return head
    }

    val answer = ListNode(head.`val`)
    var nextNode = head.next

    fun recursion(curNode: ListNode) {
        if (nextNode != null) {
            if (curNode.`val` == nextNode!!.`val`) {
                nextNode = nextNode!!.next

                recursion(curNode)
            } else {
                curNode.next = nextNode

                recursion(curNode.next!!)
            }
        } else {
            curNode.next = null
        }
    }

    recursion(answer)

    return answer
}

// while solution
fun deleteDuplicates2(head: ListNode?): ListNode {
    var node = head

    while (node!!.next != null) {
        if (node.`val` == node.next!!.`val`) {
            node.next = node.next!!.next
        } else {
            node = node.next
        }
    }

    return head!!
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
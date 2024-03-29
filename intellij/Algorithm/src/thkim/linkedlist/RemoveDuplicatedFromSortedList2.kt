package thkim.linkedlist

fun deleteDuplicates(head: ListNode?): ListNode? {
    var head = head

    if (head?.next == null) return head

    return if (head.`val` != head.next!!.`val`) {
        head.next = deleteDuplicates(head.next)
        head
    } else {
        while (head!!.next != null && head.`val` == head.next!!.`val`) head = head.next
        deleteDuplicates(head.next)
    }
}
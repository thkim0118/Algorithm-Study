package concepts.tree

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}

class BinarySearchTreePractice {
    var head: Node? = null

    fun insertNode(data: Int): Boolean {
        if (head == null) { // Node 가 존재하지 않을 때
            head = Node(data)
        } else { // Node 가 1개 이상 존재할 때
            var findNode = head
            while (true) {
                if (data < findNode!!.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left
                    } else {
                        findNode.left = Node(data)
                        break
                    }
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right
                    } else {
                        findNode.right = Node(data)
                        break
                    }
                }
            }
        }
        return true
    }

    fun searchNode(data: Int): Node? {
        if (head == null) {
            return null
        } else {
            var findNode = head

            while (findNode != null) {
                findNode = when {
                    findNode.value == data -> {
                        return findNode
                    }
                    data < findNode.value -> {
                        findNode.left
                    }
                    else -> {
                        findNode.right
                    }
                }
            }
            return null
        }
    }

    fun delete(value: Int): Boolean {
        var searched = false

        var curParentNode = head
        var curNode = head

        head?.let { h ->
            // 노드가 1개, 해당 노드가 삭제 노드일 때
            if (h.value == value && h.left == null && h.right == null) {
                head = null
                return true
            }

            while (curNode != null) {
                if (curNode!!.value == value) {
                    searched = true
                    break
                } else if (value < curNode!!.value) {
                    curParentNode = curNode
                    curNode = curNode!!.left
                } else {
                    curParentNode = curNode
                    curNode = curNode!!.right
                }
            }

            if (searched.not()) return false
        } ?: return false // 노드가 없을 때

        if (curNode!!.left == null && curNode!!.right == null) { // Leaf Node 일 때(child node 가 없을 때)
            if (value < curParentNode!!.value) {
                curParentNode!!.left = null
                curNode = null
            } else {
                curParentNode!!.right = null
                curNode = null
            }
            return true
        } else if (curNode!!.left != null && curNode!!.right == null) { // child node 가 1개일 때 왼쪽에 있을 경우
            if (value < curParentNode!!.value) {
                curParentNode!!.left = curNode!!.left
                curNode = null
            } else {
                curParentNode!!.right = curNode!!.left
                curNode = null
            }
            return true
        } else if (curNode!!.left == null && curNode!!.right != null) { // child node 가 1개일 때 오른른쪽에 있을 경우
            if (value < curParentNode!!.value) {
                curParentNode!!.left = curNode!!.right
                curNode = null
            } else {
                curParentNode!!.right = curNode!!.right
                curNode = null
            }
            return true
        } else { // child node 가 2개일 때
            // 왼쪽에 있을 경우
            if (value < curParentNode!!.value) {
                var changeNode = curNode!!.right
                var changeParentNode = curNode!!.right

                while (changeNode!!.left != null) {
                    changeParentNode = changeNode
                    changeNode = changeNode.left
                }

                if (changeNode.right != null) { // changeNode 의 child node 가 오른쪽에 있을 때
                    changeParentNode!!.left = changeNode.right
                } else { // changeNode 의 child node 가 없을 때
                    changeParentNode!!.left = null
                }

                // 삭제할 노드의 왼쪽에 변경할 노드를 연결
                curParentNode!!.left = changeNode

                // 변경한 노드의 left, right 을 연결
                changeNode.right = curNode!!.right
                changeNode.left = curNode!!.left
                curNode = null
            } else { // 오른쪽에 있을 경우
                var changeNode = curNode!!.right
                var changeParentNode = curNode!!.right

                while (changeNode!!.left != null) {
                    changeParentNode = changeNode
                    changeNode = changeNode.left
                }

                if (changeNode.right != null) { // changeNode 의 child node 가 오른쪽에 있을 때
                    changeParentNode!!.left = changeNode.right
                } else { // changeNode 의 child node 가 없을 때
                    changeParentNode!!.left = null
                }

                // 삭제할 노드의 오른쪽에 변경할 노드를 연결
                curParentNode!!.right = changeNode

                // 변경한 노드의 left, right 을 연결
                changeNode.right = curNode!!.right
                changeNode.left = curNode!!.left
                curNode = null
            }
            return true
        }
    }
}

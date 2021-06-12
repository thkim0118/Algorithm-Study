package thkim.queue.hackerrank

fun largestRectangle(h: Array<Int>): Long {
    val stack = ArrayDeque<Int>()
    var maxArea = 0
    var area: Int
    var i = 0

    while (i < h.size) {
        if (stack.isEmpty() || h[stack.first()] <= h[i]) {
            stack.addFirst(i++)
        } else {
            val top = stack.removeFirst()

            area = if (stack.isEmpty()) {
                h[top] * i
            } else {
                h[top] * (i - stack.first() - 1)
            }

            if (area > maxArea) {
                maxArea = area
            }
        }
    }

    while (stack.isNotEmpty()) {
        val top = stack.removeFirst()

        area = if (stack.isEmpty()) {
            h[top] * i
        } else {
            h[top] * (i - stack.first() - 1)
        }

        if (area > maxArea) {
            maxArea = area
        }
    }

    return maxArea.toLong()
}

fun main() {
//    largestRectangle(arrayOf(8979, 4570, 6436, 5083, 7780, 3269, 5400, 7579, 2324, 2116))

//    largestRectangle(arrayOf(1, 2, 3, 4, 5))
//    largestRectangle(arrayOf(1, 3, 5, 9, 11))
    largestRectangle(arrayOf(3, 2, 5, 6, 1, 4, 4))
}
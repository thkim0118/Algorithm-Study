package thkim.stack.element

class NextGreaterElement2 {

    fun nextGreaterElements(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val stack = ArrayDeque<Int>()

        for (i in 2 * nums.size - 1 downTo 0) {
            while (stack.isNotEmpty() && nums[stack.first()] <= nums[i % nums.size]) {
                stack.removeFirst()
            }

            res[i % nums.size] = if (stack.isEmpty()) -1 else nums[stack.first()]
            stack.addFirst(i % nums.size)
        }

        return res
    }

}
package thkim.stack.element

import java.util.*


class NextGreaterElement {

    /*
     * input :  [1, 2, 1],  [1, 2, 3, 4, 3],    [1, 2, 3, 4, 3, 6, 0, 5],   [1,2,3,6,0,5,1,0,1,7]
     * output : [2, -1, 2], [2, 3, 4, -1, 4],   [2, 3, 4, 6, 6, -1, 5, 6],  [2,3,6,7,5,7,7,1,7,-1]
     */
    fun nextGreaterElements(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        val stack = Stack<Int>()

        // nums 를 우측에서 좌측으로 2회 순회
        for (i in 2 * nums.size - 1 downTo 0) {
            // nums 의 현재 포인터와 stack 의 index(현재 포인터의 우측)를 이용하여 큰 수가 있는지 비교
            while (stack.isNotEmpty() && nums[stack.peek()] <= nums[i % nums.size]) {
                println("pop index -> ${stack.peek()}")
                stack.pop()
            }

            // stack 에 index 가 없다면 -1, 있다면 nums 의 index 를 참조한 값을 insert
            answer[i % nums.size] = if (stack.empty()) -1 else nums[stack.peek()]
            println("answer[i % nums.size] : ${answer[i % nums.size]}")
            stack.push(i % nums.size) // 현재 인덱스를 stack 에 push
            println("i % nums.size : ${i % nums.size}")
        }

        return nums
    }

    fun nextGreaterElements3(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val stack = Stack<Int>()

        for (i in 2 * nums.size - 1 downTo 0) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.size]) {
                stack.pop()
            }
            res[i % nums.size] = if (stack.empty()) -1 else nums[stack.peek()]
            stack.push(i % nums.size)
        }

        return res
    }

    fun nextGreaterElements2(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        for (i in nums.indices) {
            res[i] = -1
            for (j in 1 until nums.size) {
                if (nums[(i + j) % nums.size] > nums[i]) {
                    res[i] = nums[(i + j) % nums.size]
                    break
                }
            }
        }
        return res
    }

    fun nextGreaterElements1(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val doublenums = IntArray(nums.size * 2)

        System.arraycopy(nums, 0, doublenums, 0, nums.size)
        System.arraycopy(nums, 0, doublenums, nums.size, nums.size)

        for (i in nums.indices) {
            res[i] = -1
            for (j in i + 1 until doublenums.size) {
                if (doublenums[j] > doublenums[i]) {
                    res[i] = doublenums[j]
                    break
                }
            }
        }
        return res
    }
}
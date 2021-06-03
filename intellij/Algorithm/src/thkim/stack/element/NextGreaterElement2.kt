package thkim.stack.element

class NextGreaterElement2 {

    /*
     * input :  [1, 2, 1],  [1, 2, 3, 4, 3],    [1, 2, 3, 4, 3, 6, 0, 5],   [1,2,3,6,0,5,1,0,1,7]
     * output : [2, -1, 2], [2, 3, 4, -1, 4],   [2, 3, 4, 6, 6, -1, 5, 6],  [2,3,6,7,5,7,7,1,7,-1]
     */
    fun nextGreaterElements(nums: IntArray): IntArray {
        val answer = arrayListOf<Int>()



        return nums
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
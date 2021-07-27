package thkim.backtracking

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(" ").map { it.toInt() }

    val arr = arrayListOf<Int>()

    readLine().split(" ").forEach { arr.add(it.toInt()) }

    fun searchCombination(nums: List<Int>, index: Int = 0, depth: Int = nums.size, combination: String = "") {
        if (index == nums.size) {
            if (depth == 0) println(combination.toList())
        } else {
            searchCombination(nums, index + 1, depth - 1, combination + nums[index])
            searchCombination(nums, index + 1, depth, combination)
        }
    }

    searchCombination(arr.sorted(), depth = M)

}
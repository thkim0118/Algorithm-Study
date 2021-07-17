package concepts.tree

import java.util.*
import kotlin.collections.ArrayList

class SelectSort {

    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {
        var lowest: Int

        for (i in 0 until dataList.size - 1) {
            lowest = i

            for (j in i + 1 until dataList.size) {
                if (dataList[lowest] > dataList[j]) {
                    lowest = j
                }
            }
            Collections.swap(dataList, lowest, i)
        }
        return dataList
    }

}
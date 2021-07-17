package concepts.tree

import java.util.*

class BubbleSort {

    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {
        for (i in 0 until dataList.size - 1) {
            var isSwapped = false

            for (j in 0 until dataList.size - 1 - i) {
                if (dataList[j] > dataList[j + 1]) {
                    Collections.swap(dataList, j, j + 1)
                    isSwapped = true
                }
            }

            if (!isSwapped) break
        }

        return dataList
    }

}
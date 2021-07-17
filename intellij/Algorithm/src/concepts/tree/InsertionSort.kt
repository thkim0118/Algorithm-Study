package concepts.tree

import java.util.*

class InsertionSort {

    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {
        for (index in 0 until dataList.size - 1) {
            for (index2 in index + 1 downTo 0) {
                if (dataList[index2] < dataList[index2 - 1]) {
                    Collections.swap(dataList, index2, index2 - 1)
                } else {
                    break
                }
            }
        }
        return dataList
    }

}
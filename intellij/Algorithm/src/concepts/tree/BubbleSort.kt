package concepts.tree

import java.util.*

class BubbleSort {

    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {
        for (i in 0 until dataList.size - 1) {
            var isSwapped = false

            // 가장 우측의 데이터는 이미 정렬된 데이터이므로 i 번째는 확인하지 않는다.
            for (j in 0 until dataList.size - 1 - i) {
                if (dataList[j] > dataList[j + 1]) {
                    Collections.swap(dataList, j, j + 1)
                    isSwapped = true
                }
            }

            // swap 이 발생하지 않았다면 정렬된 상태이므로 반복문을 종료한다.
            if (!isSwapped) break
        }

        return dataList
    }

}
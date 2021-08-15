package concepts.tree

class QuickSort {
    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {
        if (dataList.size <= 1) return dataList

        val pivot = dataList[0]

        val leftArr = arrayListOf<Int>()
        val rightArr = arrayListOf<Int>()

        for (i in 1 until dataList.size) {
            if (dataList[i] > pivot) {
                rightArr.add(dataList[i])
            } else {
                leftArr.add(dataList[i])
            }
        }

        return arrayListOf<Int>().apply {
            addAll(sort(leftArr))
            addAll(listOf(pivot))
            addAll(sort(rightArr))
        }
    }
}

fun main() {
    val testData = arrayListOf<Int>()

    for (index in 0..99) {
        testData.add((Math.random() * 100).toInt())
    }
    val qSort = QuickSort()
    println(qSort.sort(testData))
}
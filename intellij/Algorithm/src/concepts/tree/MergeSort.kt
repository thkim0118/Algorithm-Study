package concepts.tree

class MergeSort {
    fun sort(dataList: ArrayList<Int>): ArrayList<Int> {

        fun mergeArr(leftArr: ArrayList<Int>, rightArr: ArrayList<Int>): ArrayList<Int> {
            val mergeArr = arrayListOf<Int>()
            var leftPoint = 0
            var rightPoint = 0

            // Case 1. left, right 모두 존재
            while (leftArr.size > leftPoint && rightArr.size > rightPoint) {
                if (leftArr[leftPoint] > rightArr[rightPoint]) {
                    mergeArr.add(rightArr[rightPoint])
                    rightPoint += 1
                } else {
                    mergeArr.add(leftArr[leftPoint])
                    leftPoint += 1
                }
            }

            // Case 2. right 데이터가 없을 때
            while (leftArr.size > leftPoint) {
                mergeArr.add(leftArr[leftPoint])
                leftPoint += 1
            }

            // Case 3. Left 데이터가 없을 때
            while (rightArr.size > rightPoint) {
                mergeArr.add(rightArr[rightPoint])
                rightPoint += 1
            }

            return mergeArr
        }

        fun splitArr(dataList: ArrayList<Int>): ArrayList<Int> {
            if (dataList.size <= 1) return dataList

            val medium = dataList.size / 2

            val leftArr = splitArr(ArrayList(dataList.subList(0, medium)))
            val rightArr = splitArr(ArrayList(dataList.subList(medium, dataList.size)))

            return mergeArr(leftArr, rightArr)
        }

        return splitArr(dataList)
    }
}

fun main() {
    val testData = ArrayList<Int>()

    for (index in 0 until 10) {
        testData.add((Math.random() * 100).toInt())
    }

    val mSort = MergeSort()
    println(mSort.sort(testData))
}


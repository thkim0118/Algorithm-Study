# 구간 합 계산
``` python
data = [10, 20, 30, 40, 50]

sum_value = 0
prefix_sum = [0]
for i in data:
  sum_value += i
  prefix_sum.append(sum_value)

left = 3
right = 4
print(prefix_sum[right] - prefix_sum[left - 1])
```
* kotlin 에서 원소에 접근할 때 0번 부터 접근하므로 -1 을 더하였다.
```kotlin
fun getArraySum(intList: List<Int>, left: Int, right: Int): Int {
    val prefixSum = arrayListOf<Int>()
    var sumValue = 0

    for (i in intList) {
        sumValue += i
        prefixSum.add(sumValue)
    }

    return prefixSum[right - 1] - prefixSum[left - 2]
}
```

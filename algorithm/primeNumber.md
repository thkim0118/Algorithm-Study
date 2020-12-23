# 소수의 판별
## 입력한 값에 대한 소수 판별
> 시간 복잡도 O(X^1/2)
### python
```python
import math

def is_prime_number(x):
  for i in range(2, int(math.sqrt(x)) + 1):
    if x % i == 0:
      return False
  return True

print(is_prime_number(7))     -> True
print(is_prime_number(10287)) -> False
```

### kotlin
```kotlin
fun isPrimeNumber(num: Int): Boolean {
    val range = floor((sqrt(num.toDouble()))).toInt() + 1
    for (i in 2..range) {
        if (num % i == 0) return false
    }
    return true
}

fun main(args: Array<String>) {
  println(isPrimeNumber(7))     -> true
  println(isPrimeNumber(10287)) -> false
}
```

## 여러 개의 수가 소수이니지 아닌지를 판별할 때
> 에라토스테네스의 체 알고리즘이 대표적인 방법이다.
* 2부터 N까지의 모든 자연수를 나열한다.
* 남은 수 중에서 아직 처리하지 않은 가장 작은 수 i를 찾는다.
* 남은 수 중에서 i의 배수를 모두 제거한다(i는 제거하지 않는다).
* 더 이상 반복할 수 없을 때까지 2, 3번째 과정을 반복한다.

> 매 스텝마다 남은 수 중에서 아직 처리하지 않은 가장 작은수 i를 찾는다고 하였으나,\
> 이때 i는 N의 제곱근까지만 증가시켜 확인하면 된다.

> 시간 복잡도는 O(NloglogN) 으로 선형 시간에 동작할 정도로 빠르다.\
> 그러나 메모리가 많이 필요하다는 단점이 있다.
### python
> n 까지의 소수를 출력하는 방법
```python
import math

n = 1000
array = [True for i in range(n + 1)]

for i in range(2, int(math.sqrt(n)) + 1):
   if array[i] == True:
     j = 2
     while i * j <= n:
       array[i * j] = False
       j += 1

for i in range(2, n + 1):
  if array[i]:
    print(i, end=' ')
```
### kotlin
> 입력받은 num 까지의 소수를 list 로 담아내는 함수
```kotlin
fun getPrimeNumber(num: Int): List<Int> {
    val answer: MutableList<Int> = mutableListOf()

    val array: MutableList<Boolean> = mutableListOf()

    for (i in 0..num) {
        array.add(true)
    }

    val range = floor((sqrt(num.toDouble()))).toInt()
    println("test : $range")

    for (i in 2..range) {
        if (array[i]) {
            var j = 2
            while (i * j <= num) {
                array[i * j] = false
                j += 1
            }
        }
    }

    for (i in 2..num) {
        if (array[i]) answer.add(i)
    }

    return answer.toList()
}
```

# 투 포인터
* 투 포인터 알고리즘이란
  * 리스트에 순차적으로 접근해야 할 때 2개의 점의 위치를 기록하면서 처리하는 알고리즘이다.
## 특정한 합을 가지는 부분 연속 수열 찾기
> 부분 연속 수열의 시작점(start)과 끝점(end)의 위치를 기록\
> 특정한 부분합을 M이라 가정할 때 알고리즘은 아래와 같다.
1. 시작점(start)과 끝점(end)이 첫 번째 원소의 인덱스(0)를 가리키도록 한다.
2. 현재 부분합이 M과 같다면 카운트한다.
3. 현재 부분합이 M보다 작으면 end를 1 증가 시킨다.
4. 현재 부분합이 M보다 크거나 같으면 start를 1 증가 시킨다.
5. 모든 경우를 확일할 때까지 2번부터 4번까지의 과정을 반복한다.
### python
```python
n = 5
m = 5
data = [1, 2, 3, 2, 5]

count = 0
interval_sum = 0
end = 0

for start in range(n):
  while interval_sum < m and end < n:
    interval_sum += data[end]
    end += 1

  if interval_sum == m:
    count += 1
  interval_sum -= data[start]

print(count) -> 3
```
```kotlin
fun getTwoPointerCount(sum: Int) {
    val data = arrayOf(1, 2, 3, 2, 5, 8, 1, 9, 2, 3, 5)

    val size = data.size - 1
    var count = 0
    var intervalSum = 0
    var end = 0

    for (start in 0..size) {
        while (end <= size && intervalSum < sum) {
            intervalSum += data[end]
            end += 1
        }
        if (intervalSum == sum) count += 1

        intervalSum -= data[start]
    }

    println(count)
}
```
## 정렬되어 있는 두 리스트의 합집합
1. 정렬된 리스트 A와 B를 입력받는다.
2. 리스트 A에서 처리되지 않은 원소 중 가장 작은 원소를 i가 가리키도록 한다.
3. 리스트 B에서 처리되지 않은 원소 중 가장 작은 원소를 j가 가리키도록 한다.
4. A[i]와 b[j] 중에서 더 작은 원소를 결과 리스트에 담는다.
5. 리스트 A와 B에서 더 이상 처리할 원소가 없을 때까지 2 ~ 4번의 과정을 반복한다.
### python
```python
n, m = 3, 4
a = [1, 3, 5]
b = [2, 4, 6, 8]

result = [0] * (n + m)
i = 0
j = 0
k = 0

while i < n or j < m:
  if j >= m or (i < n and a[i] <= b[j]):
    result[k] = a[i]
    i += 1

  else:
    result[k] = b[j]
    j += 1
  k += 1

for i in result:
  print(i, end=' ')
  
-> 1 2 3 4 5 6 8
```
### kotlin
```kotlin
fun getMergeArray(arr1: Array<Int>, arr2: Array<Int>): List<Int> {
    val answer = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < arr1.size || j < arr2.size) {
        // arr2 배열이 모두 처리되었거나, arr1 배열의 원소가 더 작을 때.
        if (j >= arr2.size || (i < arr1.size && arr1[i] <= arr2[j])) {
            answer.add(arr1[i])
            i += 1
        } else {
            answer.add(arr2[j])
            j += 1
        }
    }
    return answer.toList()
}
```

# 소수 구하기
* M 이상 N 이하의 소수를 모두 출력하라.
* 조건
  * 첫째 줄에 자연수 M과 N이 빈칸을 사이에 두고 주어진다.(M, N 은 1 보다 크거나 같고 1,000,000 보다 작거나 같다)
  * 단, M 이상 N 이하의 소수가 하나 이상 있는 입력만 주어진다.
* 출력 조건
  * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
```python
입력 예시
3 16

출력 예시 
3
5
7
11
13
```

```python
import math

minNum, maxNum = map(int, input().split())

array = [True for i in range(maxNum + 1)]
array[1] = 0

for i in range(2, int(math.sqrt(maxNum)) + 1):
  if array[i] == True:
    j = 2
    while i * j <= maxNum:
      array[i * j] = False
      j += 1

for i in range(minNum, maxNum + 1):
  if array[i]:
    print(i)
```

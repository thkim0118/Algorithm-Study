# Greedy Algorithm
* Greedy : 탐욕스러운
* Greedy Algorithm : 현재를 기준으로 당장 좋은 것만 고르는 방법으로 문제를 푸는 알고리즘
  * **문제 풀이를 위한 최소한의 아이디어를 떠올리고 이것이 정당한지 검토할 수 있어야 답을 도출할 수 있다.**
---
## 큰 수의 법칙
> 나의 풀이
```python
n, m, k = map(int, input().split())

l = list(map(int, input().split()))

l.sort(reverse = True)

result = 0

i = 0
j = 0

while i < m:
  if j != 0:
    j = 0
    result += l[1]
    i += 1
  else:
    while j < k:
      if i >= m:
        break
      result += l[0]
      j += 1
      i += 1

print(result)
```
> 다른 풀이
```python
n, m, k = map(int, input().split())

data = list(map(int, input().split()))

data.sort()
first = data[n - 1]
second = data[n - 2]

result = 0

while True:
  for i in range(k):
    if m == 0:
      break
    result += first
    m -= 1
  if m == 0:
    break
  result += second
  m -= 1

print(result)
```
* m 값이 매우 커진다면 시간 초과 가능성이 존재한다.
* 반복되는 수열에 대해서 파악한 후 그에 대한 식을 세워 알고리즘을 작성한다.
* 효율적인 풀이는 아래와 같다.
```python
n, m, k = map(int, input().split())

data = list(map(int, input().split()))

data.sort()
first = data[n - 1]
second = data[n - 2]

# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += (count) * first # 가장 큰 수 더하기
result += (m - count) * second # 두 번째로 큰 수 

print(result)
```

## 숫자 카드 게임
```python
n, m = map(int, input().split())

result = 0

for i in range(n):
  data = list(map(int, input().split()))
  min_value = min(data)
  
  result = max(result, min_value)

print(result)
```
```python
n, m = map(int, input().split())

result = 0

for i in range(n):
  data = list(map, input().split())

  min_value = 10001
  for a in data:
    min_value = min(min_value, a)
  result = max(result, min_value)

print(result)
```

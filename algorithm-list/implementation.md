# Implementation
* 머릿속에 있는 알고리즘을 소스코드로 바꾸는 과정
* 완전 탐색과 시뮬레이션이 대체로 구현 알고리즘에 해당한다.
* 완전 탐색
  * 모든 경우의 수를 다 계산하여 해결하는 방법
  * 만약 확인해야 할 데이터의 개수가 100만 개 이하일 때 완전 탐색을 사용하면 적절하다.
* 시뮬레이션
  * 문제에서 제시한 알고리즘을 한 단계씩 차례대로 직접 수행해야하는 문제
> 시뮬레이션
```python
n = int(input())

x, y = 1, 1

plans = input().split()

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

for plan in plans:
  for i in range(len(move_types)):
    if plan == move_types[i]:
      nx = x + dx[i]
      ny = y + dy[i]

  if nx < 1 or ny < 1 or nx > n or ny > n:
    continue
    
    x, y = nx, ny

print(x, y)
```
> 완전 탐색
```python
h = int(input())

count = 0
for i in range(h + 1):
  for j in range(60):
    for k in range(60):
      if '3' in str(i) + str(j) + str(k):
        count += 1

print(count)
```

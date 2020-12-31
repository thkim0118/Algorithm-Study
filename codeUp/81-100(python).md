# 코드업 81-100 python
* 97, 99 제외
## 81
> 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
단, n, m은 10이하의 자연수\
> 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
```python
a, b = map(int, input().split())

for i in range(a):
  for j in range(b):
    print((i + 1), (j + 1))
```

## 82
> 16진수로 한 자리 수가 입력된다.
단, A ~ F 까지만 입력된다.\
> 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
계산 결과도 16진수로 출력해야 한다.
```python
a = input()

for i in range(1, 16):
  print(
    str(a) + "*" + 
    str(hex(i)[2:].upper()) + "=" + 
    str(hex(int(a, 16)*i))[2:].upper())
```

## 83
> 10 보다 작은 정수 1개가 입력된다.
(1 ~ 9)\
> 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
```python
a = int(input())

for i in range(1, (a + 1)):
  if i % 3 == 0:
    print('X', end = ' ')
  else:
    print(i, end = ' ')
```

## 84
> 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.\
> 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
```python
a, b, c = map(int, input().split())

count = 0

for i in range(a):
  for j in range(b):
    for k in range(c):
      count += 1
      print(i, j, k)

print(count)
```

## 85
> h, b, c, s 가 공백을 두고 입력된다.
h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.\
> 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
```python
h, b, c, s = map(int, input().split())

result = ((h * b * c * s) / 8) / 1024 / 1024

result = round(result, 1)

print(str(result) + " MB")
```

## 86
> w, h, b 가 공백을 두고 입력된다.
단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.\
> 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
```python
w, h, b = map(float, input().split())

result = ((w * h * b) / 8) / 1024 / 1024

result = round(result, 2)

print("%.2f MB" % result)
```

## 87
> 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
단, 입력되는 자연수는 100,000,000이하이다.\
> 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
그때까지의 합을 출력한다.
```python
a = int(input())

result = 0
i = 0
while True:
  i += 1
  result += i
  if result >= a:
    print(result)
    break
```

## 88
> 정수 1개를 입력받는다.\
> 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
3의 배수는 출력하지 않는다.
```python
a = int(input())

for i in range(1, (a + 1)):
  if i % 3 == 0:
    continue
  print(i, end = ' ')
```

## 89
> 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 100)\
> n번째 수를 출력한다.
```python
a, d, n = map(int, input().split())

print((d * (n - 1)) + a)
```

## 90
> 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 10)\
> n번째 수를 출력한다.
```python
a, r, n = map(int, input().split())

print(a * (r**(n - 1)))
```

## 91
> 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)\
> n번째 수를 출력한다.
```python
a, m, d, n = map(int, input().split())

l = [0] * n
l[0] = a

for i in range(1, n):
  l[i] = (l[i - 1] * m) + d

print(l[(n - 1)])
```

## 92
> 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)\
> 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
* 최대 공약수 : gcd
* 최소 공배수 : 두 수의 곱을 최대 공약수로 나눈다.
```python
from math import gcd

a, b, c = map(int, input().split())

temp = int((a * b) / gcd(a, b))

print(int((temp * c) / gcd(temp, c)))
```

## 93
> 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.\
> 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
```python
import sys

n = sys.stdin.readline().rstrip()

num = sys.stdin.readline().rstrip().split()

l = [0] * 23

for i in range(1, int(n) + 1):
  l[int(num[(i - 1)]) - 1] += 1

for i in range(0, len(l)):
  print(l[i], end = ' ')
```

## 94
> 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.\
> 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
```python
import sys

n = sys.stdin.readline().rstrip()

num = sys.stdin.readline().rstrip().split()

num.reverse()

for i in range(0, int(n)):
  print(num[i], end = ' ')
```

## 95
> 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.\
> 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
```python
import sys

n = sys.stdin.readline().rstrip()

num = sys.stdin.readline().rstrip().split()

num = list(map(int, num))

num.sort()

print(num[0])
```

## 96
> 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.\
> 흰 돌이 올려진 바둑판의 상황을 출력한다.
흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
```python
import sys

n = int(sys.stdin.readline().rstrip())

x = [[0] * 20 for _ in range(20)]

for i in range(0, n):
  tmp = sys.stdin.readline().rstrip().split()
  x[int(tmp[0])][int(tmp[1])] = 1

for i in range(1, 20):
  for j in range(1, 20):
    print(x[i][j], end = ' ')
  print()
```

## 98
> 첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
두 번째 줄에 놓을 수 있는 막대의 개수(n)
세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.\
> 모든 막대를 놓은 격자판의 상태를 출력한다.
막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
단, 각 숫자는 공백으로 구분하여 출력한다.
```python
w, h = map(int, input().split())

n = int(input())

value = [[0] * 4 for _ in range(n)]
result = [[0] * h for _ in range(w)]

for i in range(n):
  value[i] = list(map(int, input().split()))

  for j in range(value[i][0]):
    # 가로
    if value[i][1] == 0:
      if j >= h:
        break
      else:
        result[(value[i][2] - 1)][(value[i][3] - 1) + j] = 1
    # 세로
    else:
      if j >= w:
        break
      else:
        result[(value[i][2] - 1) + j][(value[i][3] - 1)] = 1
  
for i in range(w):
  for j in range(h):
    print(result[i][j], end = ' ')
  print()
```

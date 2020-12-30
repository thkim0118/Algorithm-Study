# 코드업 61-80 python
## 61
> 2개의 정수가 공백을 두고 입력된다.\
> 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
```python
a, b = map(int, input().split())

print(a | b)
```

## 61
> 2개의 정수가 공백을 두고 입력된다.\
> 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
```python
a, b = map(int, input().split())

print(a ^ b)
```

## 62
> 2개의 정수가 공백을 두고 입력된다.\
> 두 정수 중 큰 값을 10진수로 출력한다.
```python
a, b = map(int, input().split())

print(a ^ b)
```

## 63
> 2개의 정수가 공백을 두고 입력된다.\
> 두 정수 중 큰 값을 10진수로 출력한다.
```python
a, b = map(int, input().split())

if a > b:
  print(a)
else:
  print(b)
```

## 64
> 3개의 정수가 공백을 두고 입력된다.\
> 가장 작은 값을 출력한다.
```python
a, b, c = map(int, input().split())

if a > b:
  if b > c:
    print(c)
  else:
    print(b)
elif a > c:
  print(c)
else:
  print(a)
```

## 65
> 세 정수 a, b, c 가 공백을 두고 입력된다.\
> 짝수만 순서대로 줄을 바꿔 출력한다.
```python
a = input().split()

for i in range(len(a)):
  if int(a[i]) % 2 == 0:
    print(a[i])
```

## 66
> 세 정수 a, b, c 가 공백을 두고 입력된다.\
> 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
```python
a = input().split()

for i in range(len(a)):
  if int(a[i]) % 2 == 0:
    print("even")
  else:
    print("odd")
```

## 67
> 정수 1개가 입력된다.\
> 입력된 정수에 대해
첫 줄에 minus 나 plus 를 출력하고,
두 번째 줄에 odd 나 even 을 출력한다.
```python
a = int(input())

if a < 0:
  print("minus")
else:
  print("plus")

if a % 2 == 0:
  print("even")
else:
  print("odd")
```

## 68
> 정수(0 ~ 100) 1개가 입력된다.\
> 평가 결과를 출력한다.
```python
a = int(input())

result = ""

if a >= 90:
  result = "A"
elif a >= 70:
  result = "B"
elif a >= 40:
  result = "C"
else:
  result = "D"

print(result)
```

## 69
> 영문자 1개가 입력된다.
(A, B, C, D 등의 한 문자가 입력된다.)\
> 평가내용에 따라 다른 내용이 출력된다.
```python
a = input()

if a == "A" :
    print("best!!!")
elif a=="B" :
    print("good!!")
elif a=="C" :
    print("run!")
elif a=="D" :
    print("slowly~")
else :
    print("what?")
```

## 70
> 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12).\
> 계절 이름을 출력한다.
* or 과 | 의 차이점
  * or
    * 논리 연산자
    * True, False 연산
  * |
    * 비교 연산자
    * bitwise 연산자
```python
a = int(input())

if a == 12 or a == 1 or a == 2:
  print("winter")
elif a == 3 or a == 4 or a == 5:
  print("spring")
elif a == 6 or a == 7 or a == 8:
  print("summer")
elif a == 9 or a == 10 or a == 11:
  print("fall")
```

## 71
> 정수가 순서대로 입력된다.\
> 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
(0은 출력하지 않는다.)
```python
a = input().split()

for i in range(len(a)):
  if int(a[i]) == 0:
    break
  else:
    print(a[i])
```

## 72
> 첫 줄에 정수의 개수 n이 입력되고,
두 번째 줄에 n개의 정수가 공백을 두고 입력된다.\
> n개의 정수를 한 개씩 줄을 바꿔 출력한다.
```python
import sys

num = sys.stdin.readline().rstrip()

data = sys.stdin.readline().rstrip().split()

for i in range(len(data)):
  print(data[i])
```

## 73
> 정수가 순서대로 입력된다.\
> 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
(0은 출력하지 않는다.)
```python
a = input().split()

for i in range(len(a)):
  if int(a[i]) == 0:
    break
  else:
    print(a[i])
```

## 74
> 정수 1개가 입력된다.\
> 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
```python
a = int(input())

print(a)
for i in range(1, a):
  print(a - i)
```

## 75
> 정수 1개가 입력된다.\
> 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다.
```python
a = int(input())

while a > 0:
  a -= 1
  print(a)
```

## 76
> 영문자 1개가 입력된다.
(a ~ z)\
> a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
* print 함수는 기본적으로 개행 입력이 들어가므로 end 옵션을 추가하여 다른 입력을 할 수 있다.
```python
a = input()

b = 97
while b <= ord(a):
  print(chr(b), end = " ")
  b += 1
```

## 77
> 정수 1개가 입력된다.\
> 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
```python
a = int(input())

b = 0

while b <= a:
  print(b)
  b += 1
```

## 78
> 정수 1개가 입력된다.\
> 1부터 입력된 수까지 짝수의 합을 출력한다.
```python
a = int(input())

s = 0

i = 1
while i <= a:
  if i % 2 == 0:
    s += i
  i += 1

print(s)
```

## 79
> 문자들이 1개씩 계속해서 입력된다.\
> 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
```python
a = input().split()

for i in range(len(a)):
  print(a[i])
  if (a[i] == 'q'):
    break
```

## 80
> 정수 1개가 입력된다.\
> 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
```python
a = int(input())

s = 0
i = 1

while True:
  s = s + i
  if s >= a:
    break
  i += 1

print(i)
```

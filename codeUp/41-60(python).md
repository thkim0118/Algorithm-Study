# 코드업 41-60 python
## 41
> 영문자 입력 시 다음 문자를 출력하는 프로그램.
```python
a = ord(input())
b = a + 1

print(chr(b))
```

## 42
> a를 b로 나눈 몫을 출력한다.
* 입력 : 1 3
* 출력 : 0
```python
a, b = map(int, input().split())

print("%d" % int(a / b))
```

## 43
> a를 b로 나눈 나머지을 출력한다.
* 입력 : 10 3
* 출력 : 1
```python
a, b = map(int, input().split())

print("%d" % int(a % b))
```

## 44
> 입력된 정수에 1을 더해 출력한다.
* 입력 : 2147483647
* 출력 : 2147483648
```python
a = int(input())

print(a + 1)
```

## 45
> 정수 2개가 공백을 두고 입력된다.\
> 첫줄부터 합, 차, 곱, 몫, 나머지, 나눈 값
* 입력 : 10 3
* 출력 : 13
         7
         30
         3
         1
         3.33
```python
a, b = map(int, input().split())

print(a + b)
print(a - b)
print(a * b)
print("%d" % int(a / b))
print(a % b)
print("%.2f" % float(a / b))
```

## 46
> 정수 3개가 공백을 두고 입력된다.\
> 합과 평균을 줄을 바꿔 출력한다.
```python
a, b, c = map(int, input().split())

d = a + b + c
print(d)
print("%.1f" % float(d / 3))
```

## 47
> 정수 1개가 입력된다.\
> 2배 곱한 정수를 출력한다.
```python
a = int(input())

print(a * 2)
```

## 48
> 정수 2개가 공백을 두고 입력된다.(0 <= a, b <= 10)\
> a를 2^b배 만큼 곱한 값을 출력한다.
```python
a, b = map(int, input().split())

print(a * (2**b))
```

## 49
> 두 정수 a, b가 공백을 두고 입력된다.\
> a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.
```python
a, b = map(int, input().split())

if a > b:
  print(1)
else:
  print(0)
```

## 50
> 두 정수 a, b가 공백을 두고 입력된다.\
> a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
```python
a, b = map(int, input().split())

if a == b:
  print(1)
else:
  print(0)
```

## 51
> 두 정수 a, b가 공백을 두고 입력된다.\
> b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
```python
a, b = map(int, input().split())

if a <= b:
  print(1)
else:
  print(0)
```

## 52
> 두 정수 a, b가 공백을 두고 입력된다.\
> a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
```python
a, b = map(int, input().split())

if a != b:
  print(1)
else:
  print(0)
```

## 53
> 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)\
> 입력된 값이 0이면 1, 1이면 0을 출력한다.
```python
a = bool(int(input()))

print(int(not a))
```

## 54
> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.\
> 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
```python
a, b = map(int, input().split())

if bool(a) and bool(b):
  print(1)
else:
  print(0)  
```

## 55
> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.\
> 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
```python
a, b = map(int, input().split())

if bool(a) or bool(b):
  print(1)
else:
  print(0)
```

## 56
> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.\
> 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
* xor -> ^
```python
a, b = map(int, input().split())

if bool(a) ^ bool(b):
  print(1)
else:
  print(0)  
```

## 57
> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.\
> 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
```python
a, b = map(int, input().split())

if not(bool(a) ^ bool(b)):
  print(1)
else:
  print(0)  
```

## 58
> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.\
> 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
```python
a, b = map(int, input().split())

if not(bool(a) | bool(b)):
  print(1)
else:
  print(0)  
```

## 59
> 정수 1개가 입력된다.\
> 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
```python
a = int(input())

print(~a)
```

## 60
> 2개의 정수가 공백을 두고 입력된다.\
> 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.
```python
a, b = map(int, input().split())

print(a & b)
```

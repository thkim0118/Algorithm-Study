# 코드업 41-60 python
## 41
> 영문자 입력 시 다음 문자를 출력하는 프로그램.
```python
a = ord(input())
b = a + 1

print(chr(b))
```

## 42
> a를 b로 나눈 몫을 출력한다.\
* 입력 : 1 3
* 출력 : 0
```python
a, b = map(int, input().split())

print("%d" % int(a / b))
```

## 43
> a를 b로 나눈 나머지을 출력한다.\
* 입력 : 10 3
* 출력 : 1
```python
a, b = map(int, input().split())

print("%d" % int(a % b))
```

## 44
> 입력된 정수에 1을 더해 출력한다.\
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
```python

```

## 47
```python

```

## 48
```python

```

## 49
```python

```

## 50
```python

```

## 51
```python

```

## 52
```python

```

## 53
```python

```

## 54
```python

```

## 55
```python

```

## 56
```python

```

## 57
```python

```

## 58
```python

```

## 59
```python

```

## 60
```python

```

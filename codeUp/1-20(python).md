# 코드업 1-20 python
## 1
```python
print('Hello')
```
## 2
```python
print("Hello World")
```
## 3
```python
print('Hello')
print('World')
```
## 4
```python
print('\'Hello\'')
```
## 5
```python
print("\"Hello World\"")
```
## 6
```python
print("\"!@#$%^&*()\"")
```
## 7
```python
print("\"C:\\Download\\hello.cpp\"")
```
## 8
```python
print("\u250C\u252C\u2510")
print("\u251C\u253C\u2524")
print("\u2514\u2534\u2518")
```
## 10
```python
import sys

data = sys.stdin.readline().rstrip()

print(data)
```
## 11
```python
import sys

data = sys.stdin.readline().rstrip()

print(data)
```
## 12
```python
import sys

data = sys.stdin.readline().rstrip()

data = float(data)

print("%f" % data)
```
## 13
```python
import sys

data = sys.stdin.readline().rstrip()

print(data)
```
## 14
```python
import sys

data = sys.stdin.readline().rstrip()

a, b = data.split()

print(b, a)
```
## 15
```python
a = float(input())

print("%.2f" % a)
```
## 17
```python
a = input()

print(a, a, a)
```
## 18
```python
a = input()

print(a)
```
## 19
```python
a, b, c = input().split('.')

print('%04d' % int(a), end='.')
print('%02d' % int(b), end='.')
print('%02d' % int(c))
```
## 20
```python
a, b = input().split('-')

print(a + b)
```

# 코드업 21-40 python
## 21
```python
a = input()

print(a)
```
## 22
```python
a = input()

print(a)
```
## 23
```python
a, b = input().split('.')

print(a)
print(b)
```
## 24
```python
a = input()

for i in range(len(a)):
    print('\'' + a[i] + '\'')
```
## 25
```python
a = input()
j = 4
for i in range(len(a)):
  print('['+ str(int(a[i])*(10**(j-i) )) +']')
```
## 26
```python
a = input().split(':')

print("%01d" % int(a[1]))
```
## 27
```python
a = input().split('.')

print(a[2] + "-" + a[1] + "-" + a[0])
```
## 28
```python
a = input()

print(a)
```
## 29
```python
a = float(input())

print("%.11lf" % a)
```
## 30
```python
a = input()

print(a)
```
## 31
```python
a = oct(int(input())).split('o')

print(a[1])
```
## 32
```python
a = hex(int(input())).split('x')

print(a[1])
```
## 33
```python
a = hex(int(input())).split('x')

print(str(a[1]).upper())
```
## 34
```python
a = input()

print(int(a, 8))
```
## 35
```python
a = int(input(), 16)

print('%o' % a)
```
## 36
```python
a = input()

print(ord(a))
```
## 37
```python
a = int(input())

print(chr(a))
```
## 38
```python
a, b = input().split()

print(int(a) + int(b))
```
## 39
```python
a, b = input().split()

print(int(a) + int(b))
```
## 40
```python
a = input()

print(int(a)*(-1))
```

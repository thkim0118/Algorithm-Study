# 암호 만들기
* 암호는 서로 다른 L개의 알파벳 소문자들로 구성된다.
* 최소 한 개의 모음과 최소 두 개의 자음으로 구성되었다.
* 알파벳이 암호에서 증가하는 순서로 배열되어있다.
* 입력 조건
  * 첫째 줄에 두 정수 L, C가 주어진다. (3 <= L <= C <= 15)
  * 다음 줄에는 C개의 문자들이 주어지며 공백으로 구분한다.
  * 주어지는 문자들은 알파벳 소문자이며, 중복되는 것은 없다.
* 출력 조건
  * 각 줄에 하나씩, 사전식으로 가능성 있는 암호를 모두 출력한다.
* 입력 예시
```python
4 6
a t c i s w
```
* 출력 예시
```python
acis
acit
aciw
acst
acsw
actw
aist
aisw
aitw
astw
cist
cisw
citw
istw
```
```python
from itertools import combinations

vowels = ('a', 'e', 'i', 'o', 'u')
l, c = map(int, input().split())

array = input().split(' ')
array.sort()

# 길이가 l 인 암호 조합.
for password in combinations(array, l):
  # 모음의 숫자 count.
  count = 0
  for i in password:
    if i in vowels:
      count += 1
  # 최소 1개모음과 최소 2개의 자음이 있는 경우 출력
  if count >= 1 and count <= l - 2:
    print(''.join(password))
```

# 순열과 조합
## 순열(Permutation)
> 서로 다른 n개에서 r개를 선태갛여 일렬로 나열하는 것을 의미한다.
### python
> itertools의 permutations() 함수를 사용한다.
```python
import itertools

data = [1, 2, 3]

for x in itertools.permutations(data, 2):
  print(list(x))
  
-> [1, 2]
   [1, 3]
   [2, 1]
   [2, 3]
   [3, 1]
   [3, 2]
```
## 조합(Combination)
> 서로 다른 n개에서 순서에 상관없이 서로 다른 r개를 선택하는 것을 의미한다.
### python
> itertools의 combibations() 함수를 사용한다.
```python
import itertools

data = [1, 2, 3]

for x in itertools.combinations(data, 2):
  print(list(x))
  
-> [1, 2]
   [1, 3]
   [2, 3]
```

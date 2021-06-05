# Hash
- Key를 고정된 크기의 Value로 저장하는 것.
- Key의 Hash 값을 사용하여 값을 저장하고 key-value 갯수에 따라 동적으로 크기가 증가하는 associate array.
- 평균 시간복잡도는 O(1)이다.
- 원래 데이터의 값을 Key, 매핑 후 데이터의 값을 Hash value, 매핑 과정을 hashing이라 한다.
## HashMap
- Map 인터페이스를 구현한 컬렉션
- 키(Key)와 값(Value)으로 구성된 Entry 객체를 저장하는 구조를 가지는 자료구조
- 키는 중복 저장 불가능
- 기존에 저장된 키로 값을 저장하면 기존 값은 없어지고 새로운 값이 저장된다.
- 값은 중복 저장 가능

## 선언 및 초기화
```kotlin
val hashmap1: HashMap<String, Int> = HashMap()
val hashmap2 = hashMapOf<String, Long>()
val hashmap3 = HashMap<String, Int>(10)	// capacity = 10
```

## 값 추가하기 및 삭제하기
```kotlin
val hashmap = hashMapOf<String, Int>()

// 추가하기
hashmap.put("가나다", 1)
hashmap["라마바"] = 2

// 삭제하기
hashmap.remove("가나다")
hashmap.clear() // 모든 데이터 삭제
```

 

## HashMap 함수 List
- put(key) : 값 추가
- putAll(map) : 모든 map 값 추가
- get(key) : value 리턴
- remove(key) : 값 제거
- clear() : 모든 값 제거
- isEmpty() : HashMap이 비어있다면 true 리턴
- keySet() : Key를 Set 객체로 리턴
- values() : Value를 Collection 객체로 리턴
- containsKey(key) : Key를 인자로 전달하고 존재한다면 true 리턴
- containsValue(value) : Value를 인자로 전달하고 존재한다면 true 리턴
- replace(key, value) : 전달된 key의 mapping 되는 기존 value를 전달한 value로 교체하고, 기존 value를 리턴(기존 value가 존재하지 않았다면 null 리턴)
- getOrDefault(key, defaultVal) : key를 가진 value가 존재하지 않을 경우 default 값을 리턴.
 

## 참고

- Java HashMap은 어떻게 동작하는가?
  - https://d2.naver.com/helloworld/831311

- 해시 알고리즘 요약 정리
  - https://hsp1116.tistory.com/35


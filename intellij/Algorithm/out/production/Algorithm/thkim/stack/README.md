# Stack
- Last In First Out 형식의 자료 구조.

## Stack 연산
- push(item) : item 을 스택 최상단에 추가한다.
- pop() : 최상단의 item을 반환 후 제거한다. 이때 stack이 비어있으면 EmptyStackException이 발생한다.
- peek() : 최상단의 item을 반환하고 제거하지는 않는다.
- isEmpty() : 저장된 item의 갯수가 0이면 true, 그렇지 않으면 false를 반환한다.
## Stack 클래스 문제점
- 모든 함수가 synchronized 되어있어서 단일 스레드 환경에서 성능이 떨어진다.
- Vector 클래스를 상속받은 클래스이므로 중간 데이터를 삭제하고 삽입하는 것이 가능하다.
## ArrayDeque
- Stack 의 기능을 사용하고 성능이 좋은 클래스이다.
- Stack 구조로 사용하면 Stack 클래스보다 빠르고, Queue 구조로 사용하면 Queue 클래스보다 빠르다.
- 멀티 스레드 환경에서 사용하기 위해서는 synchronized를 사용해야한다.

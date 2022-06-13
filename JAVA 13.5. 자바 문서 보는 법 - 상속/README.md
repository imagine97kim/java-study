#생활코딩/자바/자바13_5
# JAVA 13.5. 자바 문서 보는 법 - 상속
### 상속이란?
```java
java.lang.Object
    java.io.Writer
        java.io.PrintWriter
```
> java.io.PrintWriter 는 java.io.Writer 를 상속받은 자식 클래스이고,  
> java.io.Writer 는 java.lang.Object 를 상속받은 자식 클래스이다.  
> 이처럼 상속을 통해 처음부터 코드를 짜지 않고 이미 존재하는 클래스로부터 상속받아 새로운 기능을 추가한 클래스를 만들 수 있다.  

<br>

### 이클립스에서 클래스의 상속관계 보기
- 상속관계를 보기 원하는 클래스를 우클릭 후 Open Type Hierarchy 를 클릭하면 상속관계를 볼 수 있다.

<br>

### PrintWriter 클래스의 상속관계
- class Object
	- method toString
- class Writer extends Object
	- method write
- class PrintWriter extends Writer
	- method write
> PrintWriter 클래스에 toString 메소드가 실행되면 우선 PrintWriter 클래스 내에서 toString 메소드를 찾는다.  
> 없으면 부모클래스인 Writer 클래스에서 찾는다.  
> 그래도 없으면 Writer 의 부모클래스인 Object 클래스에서 찾고,  
> 있으면 메소드가 실행이 되고 없으면 오류가 난다.  
> 상속관계인 클래스에 같은 이름의 메소드가 2개 있다면, 자식 클래스의 메소드가 우선 실행된다.  
> PrintWriter 클래스를 만들 때 Writer 클래스의 메소드 write 가 입맛에 맞지 않아 새롭게 덮어쓴 것이다. (override)  

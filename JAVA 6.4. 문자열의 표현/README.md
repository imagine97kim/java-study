#생활코딩/자바/자바6_4
# JAVA 6.4. 문자열의 표현
### String VS Character
*StringApp.java*
```java
public class StringApp {
    public static void main(String[] args) {
        System.out.println("Hello World"); // String
        System.out.println('Hello World'); // ERROR
        System.out.println('H'); // Character
        System.out.println("H"); // String
    }
}
```
- 큰 따옴표 “” 는 문자열 String을 표현한다. 
- 작은 따옴표 ‘’ 는 문자 Character를 표현하기 때문에 문자열을 작은 따옴표로 묶으면 안 된다.  
<br><br>
### 특수한 문자들 ( new line, escape )
*StringApp.java*
```java
...
System.out.println("Hello \nWorld"); // 줄바꿈 문자
System.out.println("Hello "World""); // Hello "World" ?
System.out.println("Hello \"World\""); // Hello "World"
...
```
- 줄바꿈을 하고싶을 때는 \n 를 쓴다.
- “ 큰 따옴표는 문자열의 시작과 끝을 알리는 기호이기 때문에 문자열 내부에 큰 따옴표를 쓰고 싶으면 \” 를 쓰고 escape 한다고 한다.

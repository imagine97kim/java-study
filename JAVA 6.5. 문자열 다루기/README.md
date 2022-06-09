#생활코딩/자바/자바6_5
# JAVA 6.5. 문자열 다루기
### String 데이터 타입의 다양한 기능
*StringOperation.java*
```java
public class StringOperation {
    public static void main(String[] args) {
        System.out.println("Hello World".length(); // 11
        System.out.println("Hello, [[name]] ... bye.".replace("[[name]]", "imagine"); // Hello, imagine ... bye.
    }
}
```
- 자바 java 에는 문자열 String 데이터 타입과 관련된 다양한 기능들이 존재한다.
- length() 는 문자열의 길이를 나타낸다.
- replace(a, b) 는 문자열 내의 a를 b로 대체한다.

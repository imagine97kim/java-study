#생활코딩/자바/자바8_1
# JAVA 8.1. 변수의 정의
### 변수: 값이 변할 수 있는 문자(기호)
- 변수를 만들 때는 데이터 타입을 지정해줘야 한다.
- 정수 integer
*Variable.java*
```java
public class Variable {
    public static void main(String[] args) {
        int a = 1; // Number -> integer
        System.out.println(a); // 1
    }
}
```
> 정수 integer 형은 int로 선언한다.  

- 실수 double
*Variable.java*
```java
...
int b = 1.1; // ERROR
double b = 1.1;
System.out.println(b); // 1.1
...
```
> 정수 int 형 변수에 실수를 넣으면 오류가 발생한다. 변수에 실수를 넣으려면 실수형 변수를 나타내는 double 을 사용해야 한다.  

- 문자열 String
*Variable.java*
```java
...
String c = "Hello World";
System.out.println(c); // Hello World
...
```
> 문자열 string 형은 String 으로 선언한다.  

<br><br>

### 결론
- java 에서 변수를 사용하기 전에 그 변수에 넣을 값에 대한 데이터 타입을 미리 지정해줘야 한다.
- 특정 데이터 타입에 대한 변수에 값을 넣는데 오류 없이 성공했을 때 그 값은 반드시 그 데이터 타입에 부합한다.
- 따라서 해당 변수를 사용할 때마다 데이터 타입을 일일이 확인할 필요가 없다.

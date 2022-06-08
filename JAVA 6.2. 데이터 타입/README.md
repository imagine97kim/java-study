#생활코딩/자바/자바6_2
# JAVA 6.2. 데이터 타입
### 데이터 타입의 구분
- *Datatype.java*
```java
public class Datatype {
    public static void main(String[] args) {
        System.out.println(6); // Number 6
        System.out.println("six"); // String
        System.out.println("6"); // String 6
    }
}
```
> 데이터 타입마다 필요로 하는 연산들이 다 다르기 때문에 숫자 6과 문자열 6의 구분이 필요함  
<br/>

- *Datatype.java*
```java
System.out.println(6+6); // 12
System.out.println("6"+"6"); // 66
```
> 같은 “ + ” 연산자를 사용했지만 데이터 타입에 따라 연산 결과가 다름  
<br/>

- *Datatype.java*
```java
System.out.println(6*6); // 36
System.out.println("6"*"6"); // ERROR
```
> 문자열은 “ * “ 연산이 정의되지 않았기 때문에 오류가 뜸  
<br/>

- *Datatype.java*
```java
System.out.println("1111".length()); // 4
System.out.println(1111.length()); // ERROR
```
> length() 는 문자열의 길이를 나타내주는 함수이므로 숫자 데이터 타입에 적용하면 오류가 뜸   


<br/><br/><br/>

### 새로운 기술을 공부할 때 중요한 점 두 가지
1. 새로운 시스템에 존재하는 데이터 타입 종류
2. 각각의 데이터 타입 별로 존재하는 연산방법

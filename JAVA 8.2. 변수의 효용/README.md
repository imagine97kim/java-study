#생활코딩/자바/자바8_2
# JAVA 8.2. 변수의 효용
### 변수를 사용하는 이유
*Letter.java*
```java
public class Letter {
    public static void main(String[] args) {
        //1번
        System.out.println("Hello, imagine ... imagine ... bye."); // Hello, imagine ... imagine ... bye.

        String name = "egoing";
        System.out.println("Hello, " + name + " ... " + name + " ... bye."); // Hello, egoing ... egoing ... bye.

        //2번
        System.out.println(10.0); // 10.0 ??

        double VAT = 10.0;
        System.out.println(VAT); // VAT 10.0 !!
    }
}
```
1. 문자열 변수를 사용하면 문자열 조작을 한 번에 할 수 있다.
	- name 값에 따라 출력되는 문자열이 달라진다.
2. 변수를 사용하면 해당 값이 어떤 역할을 하는 값인지 직관적으로 알 수 있다.
	- 그냥 10.0 은 어떤 값인지 명확하지 않지만, VAT 라는 변수에 넣어 주어 부가가치세라는 것을 명확히 알 수 있다.
	- 코드는 미래의 나 혹은 다른 사람들이 봐야하기 때문에 직관적이고 명확한 변수선언이 중요하다.
	- 변수는 값에 이름을 부여하는 것이다.

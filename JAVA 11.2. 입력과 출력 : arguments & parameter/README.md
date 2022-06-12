#생활코딩/자바/자바11_2
# JAVA 11.2. 입력과 출력 : arguments & parameter
### Arguments 로 입력받기
- run configuration 에서 arguments 를 추가한다.
- 작은 따옴표로 각 argument 를 구분할 수 있다.
*OkJavaGoinHomeInput.java*
```java
...

public static void main(String[] args) {
    String id = args[0];
    Double bright = Double.parseDouble(args[1]);
}

...
```
> 미리 등록한 arguments 를 args[] 로 사용할 수 있다.   


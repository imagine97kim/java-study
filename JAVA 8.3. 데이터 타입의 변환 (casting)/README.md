#생활코딩/자바/자바8_3
# JAVA 8.3. 데이터 타입의 변환 (casting)
### CASTING
- 데이터 타입을 다른 데이터 타입으로 converting 하는 방법


<br><br>
### integer -> double
*Casting.java*
```java
...

double a = 1.1;
double b = 1;
System.out.println(b); // 1.0

...
```
> double 형 변수에 정수를 집어 넣으면 1의 값이 double 형인 1.0 으로 변환되어 값이 저장된다.  


<br><br>
### double -> integer
*Casting.java*
```java
...

int c = 1.1; // ERROR -> cannot convert from double to int
double d = 1.1;
int e = (int) 1.1;
System.out.println(d); // 1.1 -> double
System.out.println(e); // 1 -> integer

...

```
> int 형 변수에 실수를 집어 넣으면 소수점 아래 자리 수에 대한 손실이 일어나기 때문에 자동으로 데이터 타입이 변하지 못하고 오류가 난다.  
> 이를 해결하기 위한 방법으로 변수 d를 double 형 변수로 다시 선언해 주거나, (int) 를 사용해서 강제로 int 형 데이터 타입으로 변환시켜준다.  


<br><br>
### integer to String ?
*Casting.java*
```java
...

String f = Integer.toString(1);
System.out.println(f.getClass()); // class java.lang.String

...
```
> 모르는 것이나 궁금한 것이 생기면 검색을 적극 활용한다.  
> Google 검색 창에 “java int to string casting” 이라고 검색하면 약 870만 개의 검색결과가 나온다.  
> getClass() 는 변수가 어떤 데이터 타입을 가지는 지 출력해준다.  


<br><br>
### 결론
java 는 변수의 데이터 타입을 굉장히 엄격하게 통제하기 때문에 java 를 사용하다 보면 어떤 변수에 들어갈 값 또는 변수에 들어있는 값을 다른 데이터 타입으로 converting 해야 되는 경우가 생기는데, 그 때의 키워드가 casting 이고 그때 그때 필요한 casting 방법을 검색을 통해 알아내면 된다.

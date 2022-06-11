#생활코딩/자바/자바9_2
# JAVA 9.2. 프로그램 만들기 - IoT 라이브러리 설치하기
### 라이브러리 사용하기
- https://github.com/egoing/java-iot
- https://gitlab.com/egoing/java-iot
- https://bitbucket.org/egoing/java-iot/src/master
- 사용할 라이브러리 폴더 전체를 우리의 프로젝트 폴더에 복사한다.

<hr>
#생활코딩/자바/자바9_3
# JAVA 9.3. IOT 프로그램 만들기
### 패키지 불러오기
*Ok_javaGoinHome.java*
```java
import org.opentutorials.iot.Elevator;

public class Ok_javaGoinHome {

    // Elevator call

    // Security off

    // Light on

}
```
> import 를 이용하여 Elevator 클래스를 불러온다.  

<br>

### 패키지 활용하기
*Ok_javaGoinHome.java*
```java
...

// Elevator call
Elevator myElevator = new Elevator("JAVA APT 507");
myElevator.callForUp(1); // 엘리베이터를 1층으로 호출 

...
```
> 데이터 타입이 Elevator 인 변수 myElevator 에 JAVA APT 507 이라는 의미를 넣어준다.  
> callForUp() 메소드를 이용해서 엘리베이터를 1층으로 호출한다.  
> Security 와 Lighting 또한 같은 방식으로 작성한다.  

<br>

### 변수를 사용해서 중복 없애기
*Ok_javaGoinHome.java*
```java
...

String id = "JAVA APT 507;
Elevator myElevator = new Elevator(id);
myelevator.callForUp(1);

Security mySecurity = new Security(id);
mySecurity.off();

Lighting hallLamp = new Lighting(id + " / Hall Lamp");
hallLamp.on();

Lighting floorLamp = new Lighting(id + " / Hall Lamp");
floorLamp.on();

...
```
> 코드 상에서 중복되는 부분인 “JAVA APT 507” 이라는 문자열을 String 데이터 타입의 변수 id 에 넣어서 활용하면 코드가 훨씬 깔끔하고 관리하기도 편하다. id 의 값만 바꾸면 전체 코드가 바뀐다.  

<br>

### 결론
- 컴퓨터 언어를 통해 작업을 자동화 시킬 수 있고, 이것이 프로그래밍이다.
- 이러한 코드를 이클립스가 아닌 스마트폰 앱이나 스마트워치, 웹 등 좀 더 편리한 플랫폼 위에서 작성해 실제로 동작하게 할 수 있다.

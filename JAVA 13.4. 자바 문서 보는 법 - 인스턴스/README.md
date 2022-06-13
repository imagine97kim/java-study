#생활코딩/자바/자바13_4
# JAVA1 13.4. 자바 문서 보는 법 - 인스턴스
### 클래스의 인스턴스를 변수에 담기
*InstanceApp.java*
```java
import java.io.FileNotFoundException; // 예외처리
import java.io.IOException; // 예외처리
import java.io.PrintWriter; // 사용할 클래스

public class InstanceApp {
    public static void main(String[] args) throws IOException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello1");

    }


}
```
- PrintWriter 데이터 타입의 변수 p1 에 PrintWriter 클래스의 새로운 인스턴스를 할당한다.
	- `PrintWriter p1 = new PrintWriter("result1.txt");`

<br>

### 인스턴스를 사용하는 이유
*InstanceApp.java*
```java
...

PrintWriter.write("result1.txt", "Hello 1");
PrintWriter.write("result2.txt", "Hello 2");
PrintWriter.write("result1.txt", "Hello 1");
PrintWriter.write("result2.txt", "Hello 2");
PrintWriter.write("result1.txt", "Hello 1");
PrintWriter.write("result2.txt", "Hello 2");

...
```
- 인스턴스를 사용하지 않고 클래스의 메소드 형태로 작업을 하게 된다면, 작업을 할 때마다 어떤 파일을 수정할 지에 대한 상태를 그때 그때 설정해주어야 하기 때문에 비효율적이다.

<br>

### 생성자 Constructor
- java api document 에서 생성자 Constructor 가 없는 클래스들은 인스턴스를 생성할 수 없고 일회용으로 사용한다.

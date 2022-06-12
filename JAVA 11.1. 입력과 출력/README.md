#생활코딩/자바/자바11_1
# JAVA 11.1.  입력과 출력
### 프로그램에서의 입력과 출력
- 프로그램은 들어오는 입력을 처리해서 출력을 만들어낸다.

<br>

### 사용자에게 입력받기
*OkJavaGoinHomeInput.java*
```java
import javax.swing.JOptionPane;

...

public class OkJavaGoinHomeInput {
    public class void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter an ID");

...

    }
}
```
> 여러 패키지와 메소드를 사용해서 사용자로부터 값을 입력 받아 사용할 수 있다.  입력 값에 따라 컴퓨터는 다른 동작을 하게 된다.    

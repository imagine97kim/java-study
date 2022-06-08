#생활코딩/자바/자바5

# JAVA 5. Hello Java World
### Java로 할 수 있는 것들
1. 데스크톱 애플리케이션 만들기
```java
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("HelloWorld GUI");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(400, 300));
				JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
				frame.getContentPane().add(label);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);
				
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
```
> 위 코드의 목적은 “Hello World!!” 라는 문자열을 출력하는 것이고 나머지 코드들은 데스크탑 애플리케이션이 동작하기 위한 여러가지 자바 코드임  
  
  
  <br/><br/><br/><br/><br/>
  
  
2. 사물을 자바로 제어하기
- 손톱만한 컴퓨터를 전구에 심고, 컴퓨터에 java를 깔고 java로 만들어진 프로그램을 설치하면  java로 전구를 제어하는 스마트전구가 됨
- 사물이 인터넷에 연결되어서 프로그래밍적으로 제어됨 -> 사물인터넷 IOT  
  
  
  <br/><br/><br/><br/><br/>
  
  
3. 안드로이드 애플리케이션 만들기
- android development documentation -> https://developer.android.com/docs?hl=ko

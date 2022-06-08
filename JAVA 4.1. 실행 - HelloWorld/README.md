#생활코딩 #자바 #자바4_1

# JAVA 4.1. 실행 - HelloWorld
### 이클립스 레이아웃
- Package Explorer와 Navigator 의 차이
	- Package Explorer는 개발할 때 편리하도록 화면을 바꿔서 보여줌 (ex. 어떤 파일은 숨겨주는 등)
	- Navigator 는 어떤 파일을 감추거나 조작하지 않고 있는 그대로 보여 따라서 초심자에게 적합

### 자바 프로젝트 생성
- Create a Java project
	- 프로젝트 이름과 프로젝트 디렉토리 이름은 일치할 필요 없음
- Project layout 옵션 (소스코드 & 소스코드를 컴파일한 결과 파일)
	- Use project folder as root for sources and class files
		- 둘 다 프로젝트 폴더에 저장
		- 본 강의에서 사용할 옵션
	- Create separate folders for sources and class files
		- 프로젝트 폴더 안에 각각 다른 폴더로 저장

### 이 강의의 원본 소스코드
- https://github.com/egoing/java1
- https://gitlab.com/egoing/java1

### HelloWorldApp.java 생성
- Navigator > 프로젝트 폴더 우클릭 > New > File
- HelloWorldApp.java
```java
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}
```
- java 소스코드가 실행되면 소스코드명과 같은 클래스를 찾기 때문에 소스코드명과 같은 클래스명을 입력해주어야 함
- java 소스코드가 실행되면 소스코드명과 같은 클래스를 찾고 그 안의 main 이라는 메소드를 찾아 그 안의 코드를 실행하게 됨
- 코드를 작성하고 저장을 하면 프로젝트 폴더에 HelloWorldApp.class 라는 클래스파일이 생성되는데 클래스 파일은 Package Explorer 에서는 감추기 때문에 Navigator 에서만 확인할 수 있음

### 자바 소스코드 실행
- 우클릭 > Run as > Java Application
	- 자바 어플리케이션으로서 실행한다는 뜻
	- Console 창에 소스코드 실행결과 출력됨
	- Console
```
Hello World!!
```

### 정리
- 프로젝트 폴더 내의 확장자가 java인 파일은 사람이 읽고 쓸 수 있는 소스코드가 담겨 있음
- java 파일을 저장 하면 컴파일 과정을 거치면서 확장자가 class인 파일을 만드는데 사람이 읽도록 고안된 파일이 아니라서 글자가 깨져 보임
- java 파일을 실행(Run as Java Application) 하면 java 파일과 이름이 같은 class 파일을 실행함

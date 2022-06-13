#생활코딩/자바/자바14_1
# JAVA 14.1. 나의 앱 만들기 - 오리엔테이션
### 판매수익 분배 프로그램 만들기
- 소비자가 지불한 값 중 부가세를 제외
- 부가세를 제외한 금액 중에서 비용을 제외
- 남은 금액을 5 : 3 : 2 지분율에 따라 배당 

<br>

<hr>

#생활코딩/자바/자바14_2
# JAVA 14.2. 나의 앱 만들기 - 기본 기능 구현
*AccountingApp.java*
```java
public class AccountingApp {

	public static void main(String[] args) {
		
		System.out.println("Value of Supply: " + 12345.0);
		System.out.println("VAT: " + 12345.0 * 0.1);
		System.out.println("Total Price: " + (12345.0 + 12345.0 * 0.1));
		System.out.println("Expense: " + 12345.0 * 0.3);
		System.out.println("Income: " + (12345.0 - 12345.0 * 0.3));
		System.out.println("Dividend: " + (12345.0 - 12345.0 * 0.3) * 0.5);
		System.out.println("Dividend: " + (12345.0 - 12345.0 * 0.3) * 0.3);
		System.out.println("Dividend: " + (12345.0 - 12345.0 * 0.3) * 0.2);		

	}

}
```

<br>
<hr>

#생활코딩/자바/자바14_3
# JAVA 14.3. 나의 앱 만들기 - 변수도입
### 한번에 변수화 시키기
- 변수화 시키고자 하는 값 우클릭 -> Refactor -> Extract Local Variable
*AccountingApp.java*
```java
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = 12345.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double totalPrice = valueOfSupply + vat;
		double Expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - Expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of Supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Expense: " + Expense );
		System.out.println("Income: " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);
		

	}

}
```



<br>
<hr>

#생활코딩/자바/자바14_4
# JAVA 14.4. 나의 앱 만들기 - 입력값 도입
### arguments 사용하기
- Run 버튼 오른쪽 화살표 -> Run Configuration -> Arguments
*AccountingApp.java*
```java
...

double valueOfSupply = Double.parseDouble(args[0]);

...

```


<br>

### eclipse 없이 컴파일하고 실행하기
- terminal 을 들어가서 자바 프로젝트가 있는 폴더로 이동
- `javac AccountingApp.java` 를 실행하면 소스코드가 클래스 파일로 컴파일 된다.
- `java AccountingApp` 을 입력해서 자바 클래스 파일 실행한다. 
- `java AccountingApp 10000.0` 뒤에 값을 붙이면 Arguments 로써 동작한다.
- 클래스 파일만 있으면 JVM 이 설치된 모든 컴퓨터에서 우리가 짠 코드를 사용할 수 있는데, launch4j 같은 솔루션을 사용하면 JVM 이 설치되지 않은 컴퓨터에서도 코드를 실행시킬 수 있다.


<br>
<hr>

#생활코딩/자바/자바14_6
# JAVA 14.6. 나의 앱 만들기 - 조건문
### 특별한 조건을 추가한 프로그램
- 공급가가 10000원 미만일 경우 1번이 모든 수익을 다 가져가고,
- 공급가가 10000원 이상일 경우 5 : 3 : 2 로 수익을 분배한다고 가정한다.
*AccountingIfApp.java*
```java
...

double dividend1;
double dividend2;
double dividend3;

if(income >= 10000.0) {
    dividend1 = income * 0.5;
    dividend2 = income * 0.3;
    dividend3 = income * 0.2;
} else {
    dividend1 = income * 1;
    dividend2 = income * 0;
    dividend3 = income * 0;
}

...
```
> 조건문 내에서 변수 선언을 하게 되면 오류가 난다. (지역변수 문제인 듯)  


<br>
<hr>

#생활코딩/자바/자바14_7
# JAVA 14.7. 나의 앱 만들기 - 배열
### 배열을 도입하는 이유
1. 변수 간의 연관성을 나타낼 수 있다.
2. 변수가 많을 수록 변수가 오염될 가능성이 높아지는데 배열로 연관된 변수를 묶게 되면 오염될 가능성이 줄어든다.
*AccountingArrayApp.java*
```java
...

double[] dividendRates = new double[3];
dividendRates[0] = 0.5;
dividendRates[1] = 0.3;
dividendRates[2] = 0.2;

double dividend1 = income * dividendRates[0];
double dividend2 = income * dividendRates[1];
double dividend3 = income * dividendRates[2];

...
```



<br>
<hr>

#생활코딩/자바/자바14_8
# JAVA 14.8. 나의 앱 만들기 - 반복문
### 배열을 반복문으로 처리하기
*AccountingArrayLoofApp.java*
```java
...

int i = 0;
while(i < dividend.length) {
    System.out.println("Dividend " + i + ": " + dividend[i]);
    i++;
}

...
```
> 배열의 크기가 1이든 1억이든 코드 한 줄로 작업을 처리할 수 있다.  



<br>
<hr>

#생활코딩/자바/자바14_9
# JAVA 14.9. 나의 앱 만들기 - 메소드
### 메소드
- 메소드는 서로 연관된 코드들을 그룹핑해서 이름을 붙인 정리정돈의 상자다.

<br>

### 코드 메소드화 시키기
- 메소드로 묶을 부분 우클릭 -> Refactor -> Extract Method
*AccountingMethodApp.java*
```java
...

    public static void main(String[] args) {

...

    double vat = getVAT(valueOfSupply, vatRate);

...

    }

    public static double getVAT(valueOfSupply, vatRate) {
        return valueOfSupply * vatRate;
    }

}
```
> valueOfSupply 와 vatRate 는 main 메소드 내에서 선언된 지역변수 이기 때문에 getVAT 메소드의 parameter 로 값을 넘겨줘야 한다.  

<br>

- 전역변수 사용하기
*AccountingMethodApp.java*
```java
public class AccountingMethodApp {

    public static double valueOfSupply;
    public static double vatRate;

    public static void main(String[] args) {
...  

        valueOfSupply = Double.parseDouble(args[0]);
        vatRate = 0.1;

        double vat = getVAT();

...
    }

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

}
```
> main 메소드 밖에 static 변수로 값을 지정하게 되면 전역변수로 사용할 수 있어 getVAT 메소드에 parameter 를 넘겨줄 필요가 없다.  

<br>

### 모든 코드를 리팩토링한 결과
*AccountingMethodApp.java*
```java
public class AccountingMethodApp {
	
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void main(String[] args) {
		
		valueOfSupply = Double.parseDouble(args[0]);
		vatRate = 0.1;		
		expenseRate = 0.3;
		
		print();
		
	}

	public static void print() {
		System.out.println("Value of Supply: " + valueOfSupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total Price: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		System.out.println("Dividend 1: " + getDividend1());
		System.out.println("Dividend 2: " + getDividend2());
		System.out.println("Dividend 3: " + getDividend3());
	}

	public static double getDividend3() {
		return getIncome() * 0.2;
	}
	
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
```
> main 메소드 안에는 단 4줄의 코드만 남아있고, 원하는 메소드들을 언제든지 써서 원하는 값을 얻어낼 수 있다.  


<br>
<hr>

#생활코딩/자바/자바14_10
# JAVA 14.10. 나의 앱 만들기 - 클래스
- 클래스는 서로 연관된 변수와 메소드를 그룹핑해 이름을 붙인 것이다. 
- 정리정돈의 상자이다.

<br>

### Outline
- Window -> Show View -> Outline
- 클래스 안에 소속된 여러가지 멤버들(변수, 메소드)의 리스트를 보여준다.

<br>

### 클래스를 사용하는 이유
- 현재 프로그램에는 회계 관련 변수와 메소드만 존재하지만, 다른 기능들이 포함된 프로그램의 경우 서로 다른 연관성을 지닌 변수와 메소드들이 뒤죽박죽 섞여 있을 것이다.
- 따라서 서로 연관된 변수와 메소드를 묶어주는 클래스를 사용해 혼란과 오류를  방지한다.

<br>

### 클래스 만들어 활용하기
*AccountingClassApp.java*
```java
class Accounting {
    ...
}

public class AccountingClassApp {
    public static void main(String[] args) {
        Accounting.valueOfSupply = Double.parseDouble(args[0]);
		Accounting.vatRate = 0.1;		
		Accounting.expenseRate = 0.3;
		
		Accounting.print();
    }
}
```
> 회계와 관련된 모든 변수와 메소드들을 하나의 클래스로 묶고, main 메소드에서는 Accounting.~~ 로 활용한다.  



<br>
<hr>

#생활코딩/자바/자바14_11
# JAVA 14.11. 나의 앱 만들기 - 인스턴스
### 인스턴스
- 인스턴스는 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 다른 메소드를 가진 복제본을 만드는 것이다.
*AccountingClassApp.java*
```java
...

Accounting a1 = new Accounting();
a1.valueOfSupply = 10000.0;
a1.vatRate = 0.1;
a1.expenseRate = 0.3;
a1.print();

Accounting a2 = new Accounting();
a2.valueOfSupply = 10000.0;
a2.vatRate = 0.1;
a2.expenseRate = 0.3;
a2.print();

a1.print();

...
```

> 클래스를 복제해서 인스턴스를 생성할 때는 클래스 내의 static 변수와 메소드들의 static 을 지워줘야 한다.  
> static 변수는 처음 한번만 생성되고 동일한 변수를 여러 인스턴스에서 공유하기 때문에 인스턴스 별로 값을 다르게 주고 싶으면 non-static 변수로 할당해야 하기 때문이다.  

<br>

### 결론
- 자바에서는 메소드로 구조를 잡고, 메소드와 변수를 그룹핑해서 클래스로 구조를 잡고, 클래스를 복제한 인스턴스를 통해 또 다른 구조를 만든다.

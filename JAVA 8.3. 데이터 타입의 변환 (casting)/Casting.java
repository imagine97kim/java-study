
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // 1.0
	    double b2 = (double) 1; // 명시적 변환
	    System.out.println(b2); // 1.0
		
		
//		int c = 1.1; // ERROR -> cannot convert from double to int
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(d); // 1.1 -> double
		System.out.println(e); // 1 -> integer
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // class java.lang.String

	}

}

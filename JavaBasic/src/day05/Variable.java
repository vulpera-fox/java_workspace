package day05;

public class Variable {
	
	/* 
	 * 선언하고 사용 X
	 * 
	 * int a;
	 * a = 0;  X
	 * 
	 * 동시에는 가능
	 * 
	 * 
	 */
	
	int a = 1;
	String b;
	
	void printNum(int d) {
		
		int c = 1;
		
		System.out.println("멤버변수 : " + a);
		System.out.println("멤버변수 : " + b);
		System.out.println("지역변수 : " + c);
		System.out.println("지역변수(매개변수) : " + d);
	}
	
	
	

}

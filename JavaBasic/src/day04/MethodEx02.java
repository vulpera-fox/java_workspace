package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 *  매개변수 (parameter)
		 *  메소드가 전달받는 매개값
		 *  매개변수는 여러개를 받을수도, 받지않을수도 있다
		 */
		
		int result = calSum(100);
		
		System.out.println(result);
		
		int result2 = calSum(500);
		
		System.out.println(result2);
		
		int result3 = calSum2(30,50);
		
		System.out.println(result3);
		
		String result4 = calSum3("와" , 5);
		
		System.out.println(result4);
		
	} // main의 끝
	
	
	// 1 ~ 매개변수까지의 합
	
	static int calSum(int a) {
		int sum = 0;
		for ( int i = 1; i <= a; i++ ) {
			sum += i;
		}
		
		return sum;
	}

	// 매개변수를 2개 받음
	
	static int calSum2(int x, int y) {
		int result = x + y;
		
		return result;
	}
	
	// 정수, 문자열을 전달받는 calSum3() 생성
	
	static String calSum3( String a, int b ) {
		
		String s = "";
		
		for ( int i = 1; i <= b; i++ ) {
			s += a;
		}
		
		
		return s;
	}
	
}

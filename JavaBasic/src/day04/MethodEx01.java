package day04;

public class MethodEx01 {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		
		/*
		 *  메소드는 생성과 호출이 있어야함
		 *  메소드는 메소드 안에서 생성할 수 없다.
		 *  
		 */

		System.out.println("1~10까지의 합" + calSum());
		System.out.println("1~10까지의 합" + calSum());
		System.out.println("1~10까지의 합" + calSum());
		
		int result = calSum();
		System.out.println("1~10까지의 합:" + result);
		
		String result2 = calSum2();
		System.out.println(result2);
	
	}
	// 1~10까지 합을 구하는 반복문
	
	// 반환유형 이름()
	
	static int calSum() {
		int sum = 0;
		for ( int i = 1; i <= 10; i++ ) {
			sum += i;
		}
		return sum; // 합계를 반환한다
	}
	
	static String calSum2() {
		
		// A~Z까지 문자열 합
		String s = "";
		for ( char c = 'A'; c <= 'Z'; c++ ) {
			s += c;
		}
		
		return s;
	}
}
	



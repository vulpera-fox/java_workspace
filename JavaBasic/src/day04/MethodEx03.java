package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 
		 *  return 이
		 *  1. 메소드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 *  2. 리턴이 있는 메소드는 다른 메소드의 매개값으로도 사용된다
		 *  
		 *  3. 반환값은 없을수도 있다. 없을 경우엔 void로 선언한다
		 *  4. void 메소드에서도 return을 사용할 수 있다.
		 *     대신 값을 반환하지는 못하고 종료의 의미로 사용할 수 있다.
		 */
		
		int result = add ( add(1,2) , add(3,4) );
		System.out.println(result);

		
		// void형 메소드는 return이 없기 때문에 단순히 호출만 가능
		// System.out.println( sub() ); <- 에러발생
		
		sub();
		
		div(5,4);
		
		noReturn("hello");
		
	} // main
	
	static int add(int a, int b) {
		return a+b;
	}
	
	// 반환도 없고 매개변수도 없는 모형
	
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
	static void noReturn(String s) {
		if ( s.equals("hello")) {
			
			System.out.println("메소드를 종료합니다.");
			return;
		}
		System.out.println("hello안주니?");
	}
	
}

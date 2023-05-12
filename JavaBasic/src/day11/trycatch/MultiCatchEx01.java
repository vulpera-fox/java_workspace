package day11.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {

		// 메인 메소드도 매개변수를 가질 수 있다
		// run -> run configuration - argument

		try {

			String a1 = args[0];
			String a2 = args[1];

			int i1 = Integer.parseInt(a1);
			int i2 = Integer.parseInt(a2);

			System.out.println("두 수의 합 : " + (i1 + i2));
			
			String str = null;
			
			str.charAt(0);


			// catch문에는 에러를 처리할 정확한 에러클래스가 들어가야 한다
			// Exception은 모든 예외클래스의 부모 클래스이다
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("배열의 범위를 벗어났습니다. 매개변수를 2개 입력하세요.");	

		} catch (NumberFormatException e) {

			System.out.println("숫자를 입력하세요.");

			
		} catch (Exception e) {
			
			System.out.println("기타 예외 입니다.");
			
		}


	}

}

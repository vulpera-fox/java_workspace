package day11.trycatch;

public class ThrowEx01 {

	public static void main(String[] args) {


		try {
			System.out.println(sum(-5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

	public static int sum(int n) throws Exception {

		// 예외를 직접 생성해서, 메소드를 종료할 때 사용할 수 있다
		if( n < 0 ) {
			throw new Exception("0 이상의 값이어야 합니다."); // 예외를 생성할 때 예외에서 사용되는 메세지를 전달할 수 있다
		}

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}

}

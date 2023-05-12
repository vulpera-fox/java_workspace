package day01;

public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		for ( int i = 1; i <= 10; i++) {
		//			System.out.println(i);
		//			
		//			if ( i==5 ) break;
		
		
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용
		 * - 자바 While(True) 문장을 주로 사용함
		 * - 특정 조건에서 탈출하는 형식으로 사
		 */
		
		int i = 1;
		
		while (true) {
			System.out.println(i);
			if ( i == 15 ) {
				System.out.println("그만!");
				break;
			}
			i++;
		}

	}

}



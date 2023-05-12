package quiz17;

import java.util.Scanner;

public class Calculator  {
	
	public int input() throws Exception {
		
		/*
		 * 1. 스캐너를 이용해 정수 2개를 입력받아 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환한다
		 * 3. 예외가 발생하면 직접 예외를 생성하고 예외 메세지를 외부로 전달한다.
		 * 4. 스캐너 종료는 finally에서 처리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			return  x + y;
		} catch (Exception e) {
			throw new Exception("숫자를 입력하세요");
		} finally {
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

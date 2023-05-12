package day12.api.lang.system;

public class Main {

	public static void main(String[] args) {

		// System 클래스는 전부 static 메소드로 선언되어있다
		
		// System.exit(0); - 시스템 종
		
		
		// 1970년 1월 1일 00시 기준으로 현재와의 시간 차이를 밀리초로 반환
		// 간단한 프로그램 시간체크
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for ( long i = 0; i < 1000000000; i++ ) {
			sum += i;
		}
			
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) * 0.001);
	}

}

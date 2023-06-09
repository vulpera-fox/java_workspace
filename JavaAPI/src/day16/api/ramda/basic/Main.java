package day16.api.ramda.basic;

public class Main {

	public static void main(String[] args) {


		// car의 run을 사용할 때 마다 매번 다른기능으로 사용해야한다면 => 익명클래스를 사용할 수 있다
		/*
		Car car = new Car() {
			public void run() {
				System.out.println("익명 객체로 생성된 car");
			}
		};
		car.run();

		Car car2 = new Car() {
			public void run() {
				System.out.println("다른 내용의 car");
			}
		};

		car2.run();
		 */

		Person p = new Person();
		p.greeting(new Say01() {
			public void hello() {
				System.out.println("안녕하세요");
			}
		});

		// Say01이 가지고 있는 hello() 를 전달하는 모형
		p.greeting( () -> {System.out.println("람다에서 헬로우");});

		// 1문법 - 사용할 문장이 1줄이라면 {} 생략가능
		p.greeting(()-> System.out.println("하이하이"));

		p.greeting(new Say02() {

			@Override
			public String hello(String a, int b) {
				// 프로그래머가 작성한 내용
				return a + b;
			}
		});

		// 2문법 - 람다의 매개변수는 타입이 생략될 수 있음
		//	    - 프로그램 코드가 한줄이라면 return도 생략 가능
		p.greeting( ( a, b ) -> a+b );

		// greeting의 3번째 메소드에 전달되는 값이 짝수인지 홀수인지 판별하는 메소드 작성
		p.greeting(new Say03() {

			@Override
			public boolean bye(int a) {
				if ( a % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		p.greeting( (a) -> {
			if(a%2==0) {
				return true;
			} else {
				return false;
			}
		});
		

	}

}

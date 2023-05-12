package day10.abstract_.good;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1. 추상메소드를 사용하면 오버라이딩이 강제화 되어 프로그래머의 오버라이딩 실수를 줄일 수 있다.
		 * 2. 객체의 추상화 == 다형성
		 *    => 추상 클래스는 객체로 생성되지 않기 떄문에 자식으로 생성해서 부모타입으로 구체화하여 사용함
		 */
		
		SeoulStore s = new SeoulStore();
		s.apple();
		s.melon();
		s.grape();
		s.orange();
		s.newMenu();
		System.out.println(s.getName());
		
		BusanStore b = new BusanStore();
		b.apple();
		b.melon();
		b.grape();
		b.orange();
		b.newMenu();
		

		
	}

}

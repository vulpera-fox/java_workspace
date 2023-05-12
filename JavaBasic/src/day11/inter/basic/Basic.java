package day11.inter.basic;

	// 인터페이스를 상속받을때는 implements 사용
public class Basic implements Inter1, Inter2{
	// 인터페이스는 다중상속이 된다
	
	// 인터페이스에 있는 추상메소드는 반드시 오버라이딩 해야 한다.
	public void method01() {
		System.out.println("재정의 된 메소드 1번 사용");
	}
	
	public void method02() {
		System.out.println("재정의 된 메소드 2번 사용");
	}
	
	public void method03() {
		System.out.println("나의 메소드 3번 사용");
	}
	
	
	

}

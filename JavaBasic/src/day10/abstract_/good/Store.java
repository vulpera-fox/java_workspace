package day10.abstract_.good;

public abstract class Store {
	
	/*
	 * 1. 메소드에 abstract를 붙이면 추상메소드가 된다 (오버라이드를 강제하고 싶을 때 사용)
	 * 2. 추상메소드는 몸체가 없는 메소드 선언이다.
	 * 3. 추상클래스 내부에서만 추상메소드 선언 가능
	 * 
	 * 4. 추상클래스도 메소드, 생성자, 변수를 전부 가질 수 있다.
	 */

	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	private String name = "호식이두마리치킨";
	
	public String getName() {
		return name;
	}
	
	public Store(){
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {
		System.out.println("본점에만 있는 신메뉴");
	}
}

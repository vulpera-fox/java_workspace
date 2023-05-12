package day10.static_.basic;

public class Calculator {
	
	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static 을 붙이면 좋다
	 * 
	 * 객체마다 다른 값을 가져야 한다면 일반변수, 동일한 값을 가져야 한다면 static변수가 된다
	 */

	private String color;
	public static double pi = 3.14;
	
	
	/*
	 * 메소드
	 * 일반멤버변수를 사용하는 메소드는 static이면 안된다 ex) getter/setter
	 * 
	 * 일반멤버션수를 사용하지 않고, 외부에서 범용성있게 사용할 메소드는 static이면 좋다
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public static double circle(int r) {
		return r*r*Math.PI;
	}
}

package quiz13;

public class Rect extends Shape{
	
	/*
	 * 사각형은 side변수를 가진다
	 * 생성될 때 이름과 side를 받는다
	 * getArea() = 사각형의 너비를 구하도록 오버라이드
	 */

	private int side;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public double getArea() {

		return side * side;
	}
	
}

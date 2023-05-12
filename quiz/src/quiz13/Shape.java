package quiz13;

public abstract class Shape {
	
	public static final double PI = 3.14;
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	// 오버라이딩 필요
	public abstract double getArea();
		
	// name의 getter
	public String getName() {
		return "도형이름 : " + name;
	}
	
	

}

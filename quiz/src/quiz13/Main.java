package quiz13;

public class Main {

	public static void main(String[] args) {
		
		Rect r = new Rect("사각형",5);
		
		Circle c = new Circle("원", 3);
		
		System.out.println(r.getArea());
		System.out.println(r.getName());
		System.out.println(c.getArea());
		System.out.println(c.getName());
		

	}

}

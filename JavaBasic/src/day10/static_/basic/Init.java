package day10.static_.basic;

public class Init {
	
	public static int price;
	
	static {
		System.out.println("한번만 실행됨");
		price = 1000;
	}

}

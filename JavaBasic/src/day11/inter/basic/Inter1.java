package day11.inter.basic;

public interface Inter1 {

	// public static final이 자동으로 붙음
	int a = 100;

	// 메소드를 선언하면 자동으로 추상메소드로 취급됨
	void method01();
	
	// 인터페이스에는 static, default 메소드 선언이 가능함
	public static void method03() {
		System.out.println("static");
	}
	
	public default void method04() {
		System.out.println("default");
	}
	
	
}

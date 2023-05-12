package day05;

public class Phone {
	
	String model;
	String color;
	int price;
	
	// 생성자를 직접 생성하게 되면 JVM이 생성자를 자동 생성하지 않는다
	// 생성자는 반환유형이 없다
	// 역할 - 주로 멤버변수를 초기화하는 용도로 사용
	Phone() {
		System.out.println("생성자 호출");
		model = "Galaxy";
		color = "black";
		price = 100000;
	}
	
	// 생성자는 여러개 선언할 수 있는데,
	// 단 매개변수의 종류나 갯수가 달라야한다
	Phone(String a) {
		model = a;
		color = "Pink";
		price = 200000;
	}
	
	Phone(String a, String b) {
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b) {
		model = a;
		color = "White";
		price = b;
	}
	
	Phone(String a, String b, int c) {
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("=====폰의 정보=====");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
	}

}

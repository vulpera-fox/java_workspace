package day05;


// 설계도로 사용할 클래스는 main 이 없다

public class Pen {

	// 클래스 속성을 나타낼 때 멤버변수 (field) 라고 한다.

	int price;
	String ink;
	String company;

	// 클래스 안에 기능을 나타낼 때, 메소드라고 한다.
	void write() {
		System.out.println(ink + "색 글씨를 씁니다.");
	}
	void info() {
		System.out.println("======펜의 정보======");
		System.out.println("가격:"+price);
		System.out.println("색상:"+ink);
		System.out.println("제조사:"+company);
	}
	
}

package day08.super_;

public class Child extends Parent {

	String me;
	
	// 부모클래스의 기본 생성자가 없을 떄 해결법 2가지
	// 1. 부모클래스의 기본 생성자를 만들기
	// 2. 자식클래스에서 super(); 를 통해 부모클래스의 생성자와 강제 연결
	
	Child(String me){
		super("123","456");
		this.me = me;
	}
	
}

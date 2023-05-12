package day09.poly.basic;

/*
 * 하나의 자바 파일에는 여러 클래스 선언이 가능
 * 단 파일며오가 동일한 클래스가 있어야하고, 해당 클래스가 public 이어야 함
 */


class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}


public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	A a5 = new B(); // B -> A 변환
	
	// 기본타입변수
	int x = 1;
	double y = x; // int -> double 변환
	
	// Object클래스에는 모든 클래스가 저장가능
	Object o = new A();
	Object o2 = 1;
	Object o3 = "?";
	
	
	
	
	
	
	
	
	
	

}

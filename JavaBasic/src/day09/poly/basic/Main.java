package day09.poly.basic;

public class Main {

	public static void main(String[] args) {

		
		Child c = new Child();
		
		c.method01();
		c.method02();
		c.method03();
		
		System.out.println("========다형성적용=========");
		
		// Parent클래스처럼 사용된다. 단, 자식의 오버라이드 된 메소드가 실행된다.
		Parent p = c;
		
		p.method01();
		p.method02();
		
		System.out.println(p);
		System.out.println(c);
		
		System.out.println("====시스템 강제 형변환====");
		// 원본이 자식클래스로 생성되었다면, 강제 형변환이 가능
		
		Parent pp = new Child();
		
		 Child cc = (Child)pp;
		
		 // 주의할 점 => 다형성이 적용되었던 객체만 강제형변환이 가능
		 Object ob = new Object();
		 // Child ccc = (Child) ob;
		 
		 
		 System.out.println("============================");
		 String s = "홍길동";
		 Object obj = s;
		 String ss = (String)obj;
		
		
	}

}

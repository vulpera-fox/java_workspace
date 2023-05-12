package day12.api.lang.object;

import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {


		Person p = new Person("홍길동");

		Person p2 = new Person("홍길동");


		// 객체의 name 변수가 같다면 ture를 반환하도록 오버라이드
		System.out.println(p.equals(p2));


		// toString - 주소값을 문자열로 반환
		// toString 메소드는 멤버변수 값을 출력하도록 오버라이딩 해서 사용함
		System.out.println(p.toString());

		try {
			// 새로운 Person 객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();
			System.out.println(clonePeople.gettName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 객체의 주소를 해시알고리즘을 통해 변경한 값을 반환
		System.out.println(p.hashCode());
		
		PrintStream ps = System.out;
		ps.println("aaa");
		
	}

}

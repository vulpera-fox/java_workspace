package day10.static_.field;

public class Main {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1의 a : " + c1.a);
		System.out.println("c1의 b : " + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2의 a : " + c2.a);
		System.out.println("c2의 b : " + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("c3의 a : " + c3.a);
		System.out.println("c3의 b : " + c3.b);
		
		System.out.println("====================");
		
		/*
		 * static은 클래스 밖에 1개 생성되기 떄문에
		 * 객체 생성 없이 클래스명.변수명 으로 사용할 수 있다.
		 */
		
		Count.b++;
		Count.b = 100;
		System.out.println(Count.b);
	}

}

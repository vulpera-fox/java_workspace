package day10.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	// 일반 메소드 - 일반멤버와 정적멤버 모두 사용이 가능함
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	// 정적 메소드 - 일반멤버를 사용할 수 없고 정적멤버는 사용이 가능함
	// 단, 객체 생성을 통해서는 일반멤버 사용이 가능함
	public static int method02() {
		//a = 10; // 사용이 안되는 이유 - static이 생성 될 당시에 a변수는 존재하지 않음
		Count count = new Count();
		count.a++;
		b++;
		return b;
	}
	

}

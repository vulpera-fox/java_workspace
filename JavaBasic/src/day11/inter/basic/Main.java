package day11.inter.basic;

public class Main {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.method01();
		b.method02();
		b.method03();
		
		
		Inter1 i = new Basic();
		
		// Inter1처럼 사용가능
		i.method01();
		
		Inter2 ii = new Basic();
		
		// Inter2처럼 사용가능
		ii.method02();
		
		
		Basic bb = (Basic)i;
		
		// static 메소드의 사용
		Inter1.method03();
		
		// default 메소드의 사용 - 인터페이스에 미리 만들어진 몸체를 가지고 있는 메소드
		bb.method04();

	}

}

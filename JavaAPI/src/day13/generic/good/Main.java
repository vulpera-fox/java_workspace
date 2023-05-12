package day13.generic.good;

public class Main {

	public static void main(String[] args) {
		
		ABC<String> abc = new ABC<String>();
		
		abc.setT("안녕하세요");

		String s = abc.getT();
		System.out.println(s);
		
		
		ABC<Person> abc2 = new ABC<>();
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		
		// 제네릭 타입은 원시타입 X
		// int 말고 Integer 사
		ABC<Integer> abc4 = new ABC<>();
		
		DEF<Integer, String> def = new DEF<>();
		def.setKey(123123123);
		
		
	}

}

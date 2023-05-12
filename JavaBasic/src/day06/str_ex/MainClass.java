package day06.str_ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("==============================");
		
		// 같은 파일에서 선언한 문자열은 같은 객체를 참조하게 된다
		System.out.println(str1==str2);
		// 직접 생성명령을 내리거나 다른 클래스에서 넘어온 문자열은 다른 주소를 나타냄
		System.out.println(str1==str3); 
		// 문자열 동등비교시는 == 대신 .equals() 메소드를 사용해 비교
		System.out.println((str1.equals(str3)));
		
		// null safety
		
		
		
		
		
		
	}

}

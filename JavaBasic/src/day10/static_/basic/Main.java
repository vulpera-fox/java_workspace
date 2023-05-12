package day10.static_.basic;

public class Main {

	public static void main(String[] args) {
		
		
		String[] arr = { "abc" , "def" , "ghi" };
		int[] arr2 = { 1, 2, 3, 4 };
		char[] arr3 = { 'a' , 'b' , 'c' , 'd' };
		
		System.out.println(MyArrays.toString(arr));
		System.out.println(MyArrays.toString(arr2));
		System.out.println(MyArrays.toString(arr3));
		
		
		// 클래스가 여러번 로드 되더라도 static{}은 한번만 실행됨	
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
	}

}

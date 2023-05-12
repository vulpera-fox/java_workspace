package day11.trycatch;

public class RunTimeEx {
	
	public static void main(String[] args) {

		// 실행 에러들
		
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr[5]);
		
		// castExeption
//		String s = (String)new Object();
		
		// 문자열을 숫자로 변경
		// NumberFormatException
//		String str = "10t";
//		Integer.parseInt(str);
		
		// NullPointerException
		String s = null;
		s.charAt(0);
	}
	
}

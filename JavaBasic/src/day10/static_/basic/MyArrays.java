package day10.static_.basic;

public class MyArrays {

	/*
	 * Arrays 클래스의 toString메소드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체를 생성하지 못하도록 생성자에 접근제어자 붙이기
	 * 2. printArray() 메소드를 생성함 / 배열을 매개변수로 받아서 toString처럼 리턴되도록 메소드를 오버로딩
	 * 
	 * String , int , char 의 3종류
	 * 
	 */

	private MyArrays() {

	}


	public static String toString(String[] string) {

		String s = "";

		for ( int i = 0; i < string.length; i++ ) {
			if ( i == string.length -1 ) {
				s += string[i];
				break;
			}
			s = s + string[i] + ", ";
		}
		return "[" + s + "]";
	}

	public static String toString(int[] int1) {

		String s = "";

		for ( int i = 0; i < int1.length; i++ ) {
			if ( i == int1.length -1 ) {
				s += int1[i];
				break;
			}
			s = s + int1[i] + ", ";
		}
		return "[" + s + "]";
	}

	public static String toString(char[] char1) {

		String s = "";

		for ( int i = 0; i < char1.length; i++ ) {
			if ( i == char1.length -1 ) {
				s += char1[i];
				break;
			}
			s = s + char1[i] + ", ";
		}
		return "[" + s + "]";
	}

}

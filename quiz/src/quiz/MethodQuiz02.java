package quiz;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		// 정수 2개를 받아서 합을 출력하는 문장
		
		show();
		
		int i = input();
		int j = input();
		
		int sum = add(i,j);
		
		System.out.println(print(sum));

	}
	
	static void show() {
		System.out.println("두 수의 합을 구합니다.");
	}
	static int input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int x = sc.nextInt();
		
		return x;
	}
	static int add( int x, int y ) {
		
		return x + y;
		
	}
	static String print( int x ) {
		return "두 수의 합은 : " + x;
	}

}

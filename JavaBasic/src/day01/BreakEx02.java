package day01;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("4 X 3 = ?>");
		while (true) {
			System.out.print("정답");
			int answer = sc.nextInt();
			
			if ( answer == 12 ) {
				System.out.println("맞았습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			
		}
			

	}

}

package quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int cor = 0;
		int wrong = 0;
		
		while (true) {
			System.out.println("------------------------------");

			int x = (int) (Math.random() * 100 + 1);
			int y = (int) (Math.random() * 100 + 1);
			int op = (int) (Math.random() * 2);

			if ( op == 0 ) {
				while( (x + y) != answer || answer != 0) {
					System.out.println(x + " + " + y + " = ?");
					System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
					System.out.print("정답은?>");
					answer = sc.nextInt();
					if ( answer == 0 ) {
						break;
					}
					if ( (x + y) == answer ) {
						System.out.println("정답입니다.");
						cor++;
						break;
					} else {
						System.out.println("오답입니다.");
						wrong++;
						break;
					}
				} 
			}else if ( op == 1 ) {
				while ( (x - y) != answer || answer != 0) {
					System.out.println(x + " - " + y + " = ?");
					System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
					System.out.print("정답은?>");
					answer = sc.nextInt();
					if ( answer == 0 ) {
						break;
					}
					if( (x - y) == answer ) {
						System.out.println("정답입니다.");
						cor++;
						break;
					} else if ( ( x - y ) != answer ){
						System.out.println("오답입니다.");
						wrong++;
						break;
					}
				}
			}
			if ( answer == 0 ) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : " + cor + "\n" + "오답 : " + wrong);
				break;
			}

		}
		sc.close();
		


	}

}

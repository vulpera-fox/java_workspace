package quiz16;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * 1~100 랜덤 수 생성
		 * 
		 * 스캐너로 입력을 받고, 입력된 수가 생성된 수 보다 작을때와 클 때 문구 출력
		 * 
		 * 정답을 맞추면 시도회수를 출력
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 조정
		 */

		Scanner sc = new Scanner(System.in);
		int r = (int) (Math.random() * 100 + 1);
		int count = 0;
		int answer = 0;
		while ( r != answer ) {
			System.out.print("정답 입력> ");
			try {
				answer = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 입력이 아닙니다.");	
				sc.nextLine();
				count++;
				continue;
			}
			count++;
			if ( answer < r ) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if ( answer > r ) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if ( r == answer ) {
				System.out.print("정답입니다.\n" + "시도횟수 : " + count + "\n");
				count = 0;
			}
		}


	}

}

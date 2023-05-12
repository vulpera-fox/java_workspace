package day11.trycatch;
import java.util.Scanner;
public class TryCatchEx03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt(); // 12엔터 - 엔터 기준 앞까지만 받음
//		
//		String s = sc.nextLine(); // 엔터를 포함해서 받
		
		
		while (true) {
			try {
				
				System.out.print(">");
				int num = sc.nextInt(); // 문자 엔터값을 정상적으로 처리를 못함
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				sc.nextLine(); // 문자 + 엔터를 처리
			}
		}
		
		
	}
}

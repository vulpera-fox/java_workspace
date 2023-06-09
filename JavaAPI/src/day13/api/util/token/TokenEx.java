package day13.api.util.token;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
		

		// 빠른 문자열 분리
		// split
		// toCharArray()
		
		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다.";
		
		
		StringTokenizer st = new StringTokenizer(str1);
		
		
		// 토큰의 갯수 확인
		System.out.println("나눠진 문자열 갯수는 : " + st.countTokens());
		
		// 다음 토큰의 확인
//		System.out.println(st.nextToken());
		
		// 다음 토큰의 여부 확인
		System.out.println(st.hasMoreTokens());
		
		while ( st.hasMoreTokens() ) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("=====================================");
		
		
		// 다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		// "/" 기준으로 자름
		StringTokenizer st2 = new StringTokenizer(str2, "-./");
		
		while ( st2.hasMoreTokens() ) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("=====================================");
		
		// 구분자를 토큰에 포함시
		StringTokenizer st3 = new StringTokenizer(str2, ".-/", true);
		
		for ( int i = 0; st3.hasMoreTokens(); i++ ) {
			
			System.out.println(st3.nextToken());
		}
		
		System.out.println("=====================================");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

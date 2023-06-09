package day16.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 * [0-9]{2,4} : 0~9까지 숫자 중 2,3,4개 나올 수 있는 형태
		 * [0-9]{3} : 0~9 까지의 숫자 중 아무거나 3개 연속된 형태
		 * [A-Z]+ : 대문자 알파벳 한개이상
		 * [a-zA-Z]? : 알파벳이 0~1개 등장
		 * [가-힣]* : 한글이 0회 이상 등장
		 * 
		 * 정규표현식에 속하지 않는 문자는 그냥 사용 가능
		 * [0-9]{3}-[0-9]{4} 숫자3개-숫자4개 의 형태
		 *
		 * 정규표현식에 속하는 문자를 쓸 때는 \\
		 * \\+ : \ 가 한개 이상 등장
		 * 
		 * 정확히 일치하는 문자
		 * \?. 정확히 ? 인
		 * [0-9]{3}원 XXX원 의 형식
		 * 
		 * \\d : 숫자를 찾음 = [0-9] 와 같다
		 * \\w : 문자와 _를 찾음 = [a-zA-Z_] 와 같다
		 * \\s : 공백
		 */
		
		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/010-1234-5678/bbb123@gmail.com";
		
		// 전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		// 이메일 형식
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.com";
		
		// 패턴을 컴파일
		Pattern p = Pattern.compile(pattern);
		Pattern p2 = Pattern.compile(pattern2);
		
		Matcher m = p.matcher(info);
		Matcher m2 = p2.matcher(info);
		
		// find() - 일치하는 부분이 있다면 true
		// start() - 일치하는 부분의 첫번째 인덱스
		// end() - 일치하는 부분의 마지막 인덱스
		// group() - 일차하는 부분을 추출
		
		while( m.find() ) { // 패턴이 여러번 나오면 순서대로 찾는다
			System.out.println( "첫번째 인덱스 :" + m.start());
			System.out.println( "마지막 인덱스 :" + m.end());
			System.out.println(m.group());
		}
		
		while ( m2.find() ) {
			System.out.println( "첫번째 인덱스 :" + m2.start());
			System.out.println( "마지막 인덱스 :" + m2.end());
			System.out.println(m2.group());
		}
		
		System.out.println("=========================================");
		
		// 리스트 안의 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info,info2);
		System.out.println(list.toString());
		
		
		// 패턴생성
		
		
		for ( int i = 0; i < list.size(); i++ ) {
			String str = list.get(i);
//			Pattern x = Pattern.compile(pattern);
//			Matcher y = x.matcher(str);
			Matcher x = Pattern.compile(pattern).matcher(str);
			Matcher y = Pattern.compile(pattern2).matcher(str);
			
			if ( x.find() && y.find() ) {
				System.out.println(x.group());
				System.out.println(y.group());
			}
		}
		
		
		
		
		
		
		
		

	}

}

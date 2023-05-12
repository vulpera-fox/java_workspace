package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		// 문자열 다루기
		// 문자열은 사실 배열이다. 문자열은 인덱스가 존재함

		String str = "안녕하새오하이에";

		// 문자열을 다루는 다양한 메소드 제공

		// 문자열을 한글자씩 자르기
		System.out.println(str.charAt(3));

		// 문자열의 위치 확인 indexOf
		System.out.println(str.indexOf('하'));
		// indexOf의 결과값이 음수면 해당 단어가 문자열에 없다는 뜻	

		// lastIndexOf - 뒤에서부터 찾기
		System.out.println(str.lastIndexOf('하'));

		// 문자열 변환 toUpperCase, toLowerCase (영문일때)
		String s = "abcDEF";


		System.out.println(s.toLowerCase());
		String result = s.toUpperCase();
		System.out.println(result);
		System.out.println(s); // 원본 문자열은 그대로 유지

		System.out.println("============================================");
		// 문자열 변경 replace

		s = "abcdefaaaa";

		System.out.println(s.replace('a', 'g')); // 문자열 내의 앞쪽 단어를 뒤쪽 단어로 모두 교체

		String result2 = s.replaceFirst("a","x"); // 문자열 내의 첫번째 앞쪽 단어를 뒤쪽 단어로 교
		System.out.println(result2);

		System.out.println("============================================");

		// 공백제거 trim
		str = " 010-1234-5678 ";
		System.out.println(str.trim()); // 앞뒤 공백을 제거해서 반환

		str = " 안녕 하세오? 오늘은 4월 19일 입니다 ";
		str = str.replace(" ",""); // 공백을 모두 제거해서 원본 문자열에 저장
		System.out.println(str);


		System.out.println("============================================");

		// 문자열 자르기

		// 특정 위치에서 자르기 substring - 인덱스 기준으로 자른다
		str = "010-1234-5678";
		String rrrrr = str.substring(9); // 인덱스 미만 절삭
		System.out.println(rrrrr);

		rrrrr = str.substring(4, 8); // 4 이상 8 미만의 문자열 추출
		System.out.println(rrrrr);

		System.out.println(str);

		// split - 특정 문자를 기준으로 자름 (제대로 쓰려면 정규표현식을 알아야함........)
		System.out.println(Arrays.toString(str.split("-"))); // String 형식 배열로 추
		System.out.println(Arrays.toString(str.split("")));

		// toCharArray - char 형식 배열로 단어마다 끊어서 추출
		System.out.println(Arrays.toString(str.toCharArray()));


		System.out.println("============================================");

		// 문자열의 길이
		str = "안녕하세요";
		System.out.println(str.length());
		
		// 문자열의 비교
		if (str.equals("안녕하세요")) {
			System.out.println("둘이같다");
		} else {
			System.out.println("다르다");
		}
		
		// 문자열의 포함 여부 contains
		System.out.println(str.contains("하세"));
	}

}

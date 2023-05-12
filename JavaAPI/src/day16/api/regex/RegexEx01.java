package day16.api.regex;

public class RegexEx01 {

	public static void main(String[] args) {
		
		String info = "홍길동|30세|서울시 강남구|010-1234-5678";
		
		// 전화번호 형식을 찾아서 ***-****-**** 로 변환
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		
		// 특정 API에서 regex가 있다면, 정규표현식을 적용할 수 있다는 의미
		String result = info.replaceAll(pattern, "***-****-****");
		
		System.out.println(result);
		
		System.out.println(info.replaceAll("[0-9]{2,3}세", "**세"));
		
	}

}

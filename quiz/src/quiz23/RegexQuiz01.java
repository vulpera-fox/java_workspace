package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		// 가격 형식을 모두 찾아서 순서대로 출력
		
		String str = "안녕하세요? 점심은 4,500원 인데요. 커피가 무려 1600원 이에요. 디저트는 14000원이나 한답니다";
		
		String pattern = "[0-9]+,?[0-9]+원";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			
			System.out.println(m.group());
		}

	}

}

package quiz23;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {

		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";

		String p1 = "\\d+-\\d+";
		String p2 = "GS25";
		String p3 = "\\([가-힣0-9]+\\)";
		String p4 = "[0-9,]+원";

		List<String> list = Arrays.asList(str,str2);
		List<String> list2 = Arrays.asList(p1,p2,p3,p4);
		for ( int i = 0; i < list.size(); i++ ) {
			System.out.println("========================");
			for( int j = 0; j < list2.size(); j++ ) {
				Matcher m = Pattern.compile(list2.get(j)).matcher(list.get(i));
				if(m.find()) {
					System.out.println(m.group());
				}

			}
		}



	}

}

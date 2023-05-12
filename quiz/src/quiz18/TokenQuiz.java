package quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz {

	public static void main(String[] args) {
		
		int i = 1;
		String s = "";
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		String arr[] = new String[st.countTokens()];
		
		System.out.println("분리한 토큰의 갯수는 : " + st.countTokens());
		
		
		while ( st.hasMoreTokens() ) {
			s = st.nextToken();
			arr[i-1] = s;
			System.out.println(i + ". " + s);
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

}

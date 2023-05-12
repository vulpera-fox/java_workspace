package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] arr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

		solution(arr);


	}







	static int solution(String[] babbling) {
		int answer = 0;
		int aya = 0;
		int ye = 0;
		int woo = 0;
		int ma = 0;

		for ( int i = 0; i < babbling.length; i++ ) {
			babbling[i] = babbling[i].replaceAll("aya", "");
			babbling[i] = babbling[i].replaceAll("ye", "");
			babbling[i] = babbling[i].replaceAll("woo", "");
			babbling[i] = babbling[i].replaceAll("ma", "");

			if ( !babbling[i].equals("") ) {


			}

			System.out.println(babbling[i]);

		}
		if ( aya >=1 ) {
			answer+=1;
		} if ( ye >= 1 ) {
			answer+=1;
		} if ( woo >= 1 ) {
			answer+=1;
		} if ( ma >= 1 ) {
			answer+=1;
		}
		System.out.println(answer);
		return answer;
	}
}


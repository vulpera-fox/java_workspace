package quiz19;

import java.util.HashSet;
import java.util.Random;

public class SetQuiz01 {

	public static void main(String[] args) {

		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장
		 */
		
		HashSet<Integer> set = new HashSet<>();
		Random r = new Random();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
		}
			
		System.out.println(set.toString());
		
	}

}

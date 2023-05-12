package quiz;

import java.util.Arrays;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 절대 중복되지 않는 숫자를 추출하
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		String s = "";
		
		for ( int i = 1; i <= 10; i++ ) {
			int temp = 0;
			
			int rn1 = (int) (Math.random() * 9 );
			int rn2 = (int) (Math.random() * 9 );
			
			temp = arr[rn1];
			arr[rn1] = arr[rn2];
			arr[rn2] = temp;
			
			
		}
		
		for ( int i = 0; i < arr2.length; i++ ) {
			arr2[i] = arr[i];
			s = s + arr2[i] + " ";
		}
		System.out.println(s);

	}

}

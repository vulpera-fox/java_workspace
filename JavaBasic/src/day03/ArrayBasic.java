package day03;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		// 배열

		int[] arr;
		arr = new int[5];

		/* 배열을 지정하는 다양한 방법
		 * 
		 *	arr = new int[5];
		 *
		 *	int[] arr = new int[] { 1,2,3 };
		 *
		 *	int [] arr = { 1, 2, 3 };
		 *
		 */

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(Arrays.toString(arr));

		// 배열의 값 변경

		arr[2] = 100;
		System.out.println(Arrays.toString(arr));

		// 배열의 길이

		System.out.println("배열의 길이: " + arr.length);
		
		// 배열은 초기값을 지정하지 않으면 기본값으로 자동 초기화
		
		// int는 0, double은 0.0, String은 null
		
		int[] arr2 = new int[3];
		System.out.println(Arrays.toString(arr2));



	}

}

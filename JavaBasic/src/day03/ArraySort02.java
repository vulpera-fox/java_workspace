package day03;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {

		
		// 버블정렬 - 큰 값을 뒤로 보
//		
//		
		int[] arr = { 5, 23, 1, 43, 200, 100 ,40 };
//		int temp = 0;
//		
//		for ( int i = 0; i < arr.length-1; i++ ) {
//			for ( int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}System.out.println(Arrays.toString(arr));
		
		// 아주 유용한 기능
		Arrays.sort(arr); // 가장 빠른 정렬 - 퀵정렬
		
		System.out.println(Arrays.toString(arr));

	}

}

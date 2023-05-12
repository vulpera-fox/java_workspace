package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 정렬 - 정렬은 대략 6개
		
		// 선택 정렬
		
		int[] arr = { 5,23,1,43,200,100,40};
		int temp = 0;
		for ( int i = 0; i < arr.length-1; i++ ) {
			for ( int j = i+1; j < arr.length; j++ ) {
				
				if (arr[i] > arr[j] ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}

	}

}

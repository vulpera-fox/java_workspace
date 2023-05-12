package day03;

import java.util.Arrays;

public class Arrayinsert {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[arr.length+1];


		int data = 100;
		int targetIndex = 2;

		// newArr에 기존 배열의 값을 옮김

		for ( int i = 0; i < arr.length; i++ ) {
			newArr[i] = arr[i];
		}

		// 배열의 추가할 마지막부터 타겟인덱 까지 옮겨담는 작업

		for ( int i = newArr.length-1; i > targetIndex ; i-- ) {
			newArr[i] = newArr[i-1];
		}
		newArr[targetIndex] = data;
		
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(arr));
	}

}

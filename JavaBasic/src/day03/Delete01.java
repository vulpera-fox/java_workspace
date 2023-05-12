package day03;

import java.util.Arrays;

public class Delete01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int newArr[] = new int[arr.length-1]; // 삭제하고 복사할 새로운 배

		int index = 5;

		for (int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];


		}
		
		// 새로운 배열에 기존 배열을 옮겨담기
		
		for (int i = 0 ; i < newArr.length; i++ ) {
			newArr[i] = arr[i];
		}
		
		// 기존 arr 배열 지우기
		
		arr = null;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}

}

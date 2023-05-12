package day03;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		// Queue - First In First Out (선입선출)
		System.out.println(Arrays.toString(arr));
		
		push(4);
		push(5);
		push(6);
		push(7);
		push(9);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(Arrays.toString(arr));		
	}
	
	static int[] arr = {1,2,3};
	
	static void push ( int data ) {
		// 1. 배열을 크기를 1 더한 새로운 배열을 만든다
		int temp[] = new int[arr.length+1];
		// 2. arr 배열의 요소를 복사
		for ( int i = 0; i < arr.length; i++ ) {
			temp[i] = arr[i];
		}
		// 3. 마지막에 추가
		temp[temp.length - 1] = data;
		// 4. 원본 배열을 temp로 변경
		arr = temp;
		temp = null;
	}
	static int pop() {
		
		if ( arr.length > 0 ) {
		int del = arr[0];
		int temp[] = new int[arr.length-1];
		for ( int i = 0; i < temp.length; i++ ) {
			temp[i] = arr[i+1];
		}
		arr = temp;
		temp = null;
		
		return del;
		}
		return 0;
	}

}

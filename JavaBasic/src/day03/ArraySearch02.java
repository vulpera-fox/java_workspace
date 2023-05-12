package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이진탐색 - 절반으로 분할해서 찾아가는 방법.
		//조건 - 순서대로 정렬
		
		/*
		 * 1. 포인터(start, end)를 처음과 끝에 2개 배
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는값인지 구함
		 * 4. 찾는값보다 크다면, end를 중간값 - 1 로 내림
		 * 5. 찾는값보다 작다면, start를 중간값 +  로 올림.
		 * 
		 */
//		
		int[] arr = {1,3,5,10,20,30,50,80,100};
//		
//		Scanner sc = new Scanner(System.in);
//		int find = sc.nextInt();
//		
//		int start = 0;
//		int end = arr.length-1;
//		
//		while ( start <= end ) {
//			
//			
//			int mid = (start + end) / 2;
//			
//			if ( arr[mid] == find ) {
//				System.out.println("찾은 값은 : " + mid + "번째 존재");
//				break;
//			}
//			// 찾을값이 중간값보다 클 경
//			if ( arr[mid] < find ) {
//				start = mid + 1;
//			} else {
//				end = mid - 1;
//			}
//		}
//		
//		
//	if( start > end ) {
//		System.out.println("찾는 값이 없습니다.");
//	}
	
	
	// 찾은 위치를 보여줌 , 찾을값이 없다면 음수를 알려줌
	
	System.out.println(Arrays.binarySearch(arr, 81));
	
	
	
	
	
	
		

	}

}

package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		
		//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//		
		//		int a = 0;
		//		while ( a < arr.length) {
		//			System.out.println("배열의 " + a + " 인덱스 " + arr[a]);
		//			
		//			a++;
		//		}

		// 배열 값들의 합

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int [N];

		for ( int i = 0; i < N; i++ ) {
			int inp = sc.nextInt();
			arr[i] = inp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}

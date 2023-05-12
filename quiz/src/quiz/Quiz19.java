package quiz;

import java.util.Scanner;

import java.util.Arrays;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 금액의 동전 - 
		// 어떤 금액 x가 주어졌을때, 큰 금액부터 거슬러서 볓개가 나와야 하는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		int[] input = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for (int j = 0; j < arr.length; j++ ) {
			
			input[j] = X / arr[j];
			X = X - arr[j] * input[j];
		}
		System.out.println(Arrays.toString(input));
		
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i] + "원:" + input[i]);
		}	
		sc.close();
		
	}

}

package day01;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		// Continue의 활용
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int count = 0;
		int sum = 0;

		x:for ( int i = 1; i <= x; i++) {
			count = 0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
				if (count > 2) {
					continue x;
				}
				
			}
			if (count==2) {
				sum+=i;
				
			}
		}
		System.out.println( x + " 까지의 소수의 합은 : " + sum);
		sc.close();
	}

}

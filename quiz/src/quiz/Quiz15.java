package quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int count = 0;
		int sum = 0;

		for ( int i = 1; i <= x; i++) {
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if (count==2) {
				sum+=i;
			}
			count = 0;
		}
		System.out.println( x + " 까지의 소수의 합은 : " + sum);
		sc.close();
	}

}

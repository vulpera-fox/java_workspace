package day01;

public class EnhanceForEx01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향상된 for문 - 배열같은 연속된 타입을 돌리기에 적합
		
		for (int a : arr) {
			System.out.println(a);
			
		}
		System.out.println("----------------------------------------");
		String[] arr2 = {"월", "화", "수" , "목", "금", "토", "일"};
	
		for ( String s : arr2 ) {
			System.out.println(s);
		}
		
		int score[] = {50,40,30,20,10};
		int sum = 0;
		double avg = 0;
		
		for ( int i : score ) {
			sum += i;
			avg = (double) (sum / score.length);
		}
		System.out.println(sum + " " + avg);
		
	}
}